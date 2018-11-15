package com.sunland.webservice;

import com.sunland.dao.IVioImgDao;
import com.sunland.pojo.VioImg;
import com.sunland.utils.StringUtils;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.runner.RunWith;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-mybatis.xml",
        "classpath:spring-cxf.xml",
        "classpath:spring-transaction.xml"})
public class Test {
    @Resource
    IVioImgDao vioImgDao;
    @Resource
    private DataFieldMaxValueIncrementer unitIniIncre;

    /**
     * 测试推送案件信息
     *
     * @throws Exception
     */
    @org.junit.Test
    public void testVio() throws Exception {
        try {
            String filename = "e://xml/vio.xml";
            Document document = null;
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filename)); // 读取XML文件,获得document对象
            String request = document.asXML();
            JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
            URL url = new URL("http://localhost:8080/nbcg/webservice/vioService?wsdl");
            Client client = dcf.createClient(url);
            Object[] obj = client.invoke("Push_VioInfo", new Object[]{request});
            System.out.println(obj[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    /**
     * 测试车辆信息查询
     *
     * @throws Exception
     */
    @org.junit.Test
    public void testVehicle() throws Exception {
        try {
            String filename = "e://xml/request.xml";
            Document document = null;
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filename)); // 读取XML文件,获得document对象
            String request = document.asXML();
            JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
            URL url = new URL("http://localhost:8080/nbcg/webservice/vioService?wsdl");
            Client client = dcf.createClient(url);
            Object[] obj = client.invoke("Query_VehicleInfo", new Object[]{request});
            System.out.println(obj[0].toString());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @org.junit.Test
    public void testSeq() {
        //     DataFieldMaxValueIncrementer 接口定义了3个获取下一个主键值的方法：
        //　　int nextIntValue()：　　　　获取下一个主键值，主键数据类型为int；
        //　　long nextLongValue()：　　获取下一个主键值，主键数据类型为long；
        //　　String nextStringValue()： 获取下一个主键值，主键数据类型为String；
        //获取主键序列
        long gid = unitIniIncre.nextLongValue();
        System.out.println(gid);
    }

    @org.junit.Test
    public void testImg() {
        VioImg vioimg = vioImgDao.selectByPrimaryKey(1963);
        byte[] data = vioimg.getContent();
        String imgStr = StringUtils.encodeBase64String(data);
//        System.out.println(imgStr);
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(vioimg.getInserttime()).toString());
    }

}
