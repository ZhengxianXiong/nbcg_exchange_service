package com.sunland.webservice;

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
public class IInternalWebServiceTest {

//    @Resource
//    private IInternalService internalService;

    @Test
    public void GetProofread_Info() throws Exception {
//        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
//        factoryBean.setServiceClass(IVioWebService.class);
//        factoryBean.setAddress("http://localhost:8080/nbcg/webservice/vioService?wsdl");
//
//        IVioWebService service = (IVioWebService) factoryBean.create();
//        String request = "<?xml version=\"1.0\" encoding=\"GBK\" standalone=\"yes\"?>" +
//                "<ROOT><REQUEST><PARAM NAME=\"NOTICENO\">3301000010304717092500103</PARAM><PARAM NAME=\"YWCODE\"/>" +
//                "<PARAM NAME=\"CHANNELNO\">330100001</PARAM><PARAM NAME=\"ORIGINALNOTICENO\">0304717092500103</PARAM></REQUEST></ROOT>";
//        System.out.println(service.GetPay_Info(request));

//        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
//        Client client = factory.createClient("http://localhost:8080/nbcg/webservice/vioService?wsdl");
//        Object[] obj = client.invoke("GetPay_Info", new Object[]{"20171002","97"});
//        System.out.println(obj[0].toString());
    }
}
