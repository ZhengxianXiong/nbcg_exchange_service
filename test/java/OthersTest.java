import com.sunland.utils.DateUtil;
import org.apache.commons.codec.binary.Base64;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import sun.misc.BASE64Decoder;

import java.io.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class OthersTest {

    @Test
    public void test4() throws Exception {
        String filename = "e://xml/request.xml";
        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filename)); // 读取XML文件,获得document对象
            Element root = document.getRootElement();//读根标签
            Element requestElement = root.element("REQUEST");
            List<Element> paraElementList = requestElement.elements("PARAM");
            System.out.println(paraElementList.size());
            for (Element ele : paraElementList) {
                System.out.println(ele.getText());
                System.out.println(ele.attribute("NAME").getValue());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void test3() throws Exception {
        String filename = "e://xml/vio.xml";
        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = saxReader.read(new File(filename)); // 读取XML文件,获得document对象
            Element root = document.getRootElement();//读根标签
            Element requestElement = root.element("REQUEST");
            Element vioElement = requestElement.element("VIODETAIL");
            System.out.println(vioElement.elementTextTrim("AJBH"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Test
    public void test2() throws Exception {
        String imgFile = "e://01.jpg";//待处理的图片
        InputStream in = null;
        byte[] data = null;
        //读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String base64Str = new String(Base64.encodeBase64(data));
//        System.out.println(base64Str);
//        System.out.println("===========================================================================");
        base64Str = URLEncoder.encode(base64Str, "utf-8");
//        System.out.println(base64Str);
        base64Str = URLDecoder.decode(base64Str, "utf-8");
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            //Base64解码
            byte[] b = decoder.decodeBuffer(base64Str);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {//调整异常数据
                    b[i] += 256;
                }
            }
            //生成jpeg图片
            String imgFilePath = "e://02.jpg";//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
        } catch (Exception e) {

        }
    }

    @Test
    public void test1() throws ParseException {
        String dateStr = "2018/08/08 12:22:22";
        Date date = DateUtil.stringToDate(dateStr);
        System.out.println(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        dateStr = sdf.format(date);
        System.out.println(dateStr);
//        List<String> list1 = new ArrayList<>();
//        list1.add("1");
//        list1.add("2");
//        List<String> list2 = new ArrayList<>();
//        list1.addAll(list2);
//        System.out.println(list1);
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        System.out.println(sdf.format(new Date(new Date().getTime() - 2 * 1000 * 24 * 60 *60)));
//
//        String str = "日";
//        StringBuilder sb = new StringBuilder();
//        char[] strChar = str.toCharArray();
//        String result = "";
//        for(int i=0;i<strChar.length;i++){
//            result += Integer.toBinaryString(strChar[i])+ " ";
//        }
//        System.out.println(result);
    }
}
