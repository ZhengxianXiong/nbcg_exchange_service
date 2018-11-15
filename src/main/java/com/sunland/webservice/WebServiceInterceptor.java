package com.sunland.webservice;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.transport.http.AbstractHTTPDestination;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by batwings on 15/12/25.
 */
public class WebServiceInterceptor extends AbstractPhaseInterceptor<Message> {

    private Logger log = Logger.getLogger(this.getClass());

    public WebServiceInterceptor() {
        super(Phase.POST_INVOKE);
    }

    //    @Value("${msg.client.ipUnknow}")
    private final static String UNKNOWN_IP = "unknown ip";
    //    @Value("${msg.client.ipIllegal}")
    private final static String ILLEGAL_IP = "illegal ip";
    //    @Value("${msg.client.checkSuss}")
    private final static String CHECK_SUCCESS = "check success";
    // 利用正则映射到需要拦截的路径
//    @Value("${cfg.client.ips}")
    private String clientIPs = null;

    @Override
    public void handleMessage(Message message) throws Fault {
        log.info("==========[WebServiceInterceptor] Start...");
        //指定CXF获取客户端的HttpServletRequest : http-request；
        HttpServletRequest request = (HttpServletRequest) message.get(AbstractHTTPDestination.HTTP_REQUEST);
        if (null == request) {
            log.info("==========[null:null]" + UNKNOWN_IP);
            throw new Fault(new IllegalAccessException(UNKNOWN_IP));
        }
        // 客户端IP验证
        String ip = request.getRemoteHost();
        int port = request.getRemotePort();
        String logStart = "==========[" + ip + ":" + port + "]";
        log.info(logStart + request.getRequestURI());
        /*if (clientIPs == null || !ip.matches(clientIPs)) {
            log.info(logStart + ILLEGAL_IP);
            throw new Fault(new IllegalAccessException(ILLEGAL_IP));
        }*/
        log.info(logStart + CHECK_SUCCESS);
        log.info("==========[WebServiceInterceptor] End...");
    }
}
