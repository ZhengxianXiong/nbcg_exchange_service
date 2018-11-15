package com.sunland.webclient;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

public class OutAccessClient {//访问外部平台

    /**
     * @param tradedate
     * @param ostype
     * @return
     */
    public static String GetProofread_Info(String tradedate, String ostype) {
        String webservice = "http://localhost:8080/nbcg/webservice/vioService?wsdl";
        JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
        try {
            Client client = factory.createClient(webservice);
            Object[] obj = client.invoke("Get_AppPay_Info", new Object[]{tradedate, ostype});
            return obj[0].toString();
        } catch (Exception e) {
            return "";
        }
    }
}
