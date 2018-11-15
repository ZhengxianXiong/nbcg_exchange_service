package com.sunland.webservice;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 0zy on 2017/3/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-mybatis.xml",
        "classpath:spring-cxf.xml",
        "classpath:spring-transaction.xml"})
public class IFinanceWebServiceTest {

    @Test
    public void Get_AppPay_Info() throws Exception {
        String webservice = "http://localhost:8080/nbcg/webservice/vioService?wsdl";
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        Client client = factory.createClient(webservice);

        String request = "3205717092000390";
        Object[] obj = client.invoke("GetPay_Info", new Object[]{request});
        System.out.println(obj[0].toString());
    }

    @Test
    public void GetPay_Info() throws Exception {
//        String webservice = "http://127.0.0.1:8083/punishtyzf/webservice/financeService?wsdl";
//        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
//        Client client = factory.createClient(webservice);
//
//        String request = "{\"YWCODE\":\"\",\"WAYNAME\":\"支付机构手机支付2333\",\"TRADENO\":\"2016082521001004330269714009\"," +
//                "\"CERTIFICATENO\":\"00120160825007701\",\"TRADENAME\":\"支付宝2333\",\"PAYMONEY\":\"150.0\"," +
//                "\"TRADEDATE\":\"\",\"TRADECODE\":\"98\",\"PAYNO\":\"0012016082500007870\"," +
//                "\"PAYLISTNO\":\"001201608250007921\",\"WAYCODE\":\"32\",\"CHECKCODE\":\"23728\"," +
//                "\"PAYDATE\":\"20160825\",\"NOTICENO\":\"3301000010308716090500025\"," +
//                "\"ORIGINALNOTICENO\":\"0308716090500025\",\"PAYTIME\":\"152111\"}";
//        Object[] obj = client.invoke(JSONConst.GETPAY_INFO, new Object[]{request});
//        System.out.println( obj[0].toString());
    }

    @Test
    public void Get_AppPay_Infos() throws Exception {
//        String webservice = "http://127.0.0.1:8083/punishtyzf/webservice/financeService?wsdl";
//        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
//        Client client = factory.createClient(webservice);
//
//        String sfzhm = "330182199209014014";
//        String request = "{\"PAYEREMAIL\":\"\",\"PAYERDEFINE2\":\"\",\"PAYERMOBILE\":\"\"," +
//                "\"PAYERDEFINE1\":\"\",\"PAYERSFZ\":\"" + sfzhm + "\"," +
//                "\"REGICODE\":\"\",\"ENTERCODE\":\"\"}";
//        Object[] obj = client.invoke(JSONConst.GET_APPPAY_INFOS, new Object[]{request});
//        System.out.println(obj[0].toString());
    }
}
