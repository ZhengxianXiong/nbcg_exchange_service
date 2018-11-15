package com.sunland.utils;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by 0zy on 2017/4/6.
 */
public class StringUtils {

    public static String encodeUTF8(String xmldoc) {
        try {
            return xmldoc != null ? URLEncoder.encode(xmldoc, "utf-8") : "";
        } catch (Exception e) {
            e.getMessage();
        }
        return xmldoc;
    }

    public static String decodeUTF8(String xmldoc) {
        try {
            return URLDecoder.decode(xmldoc, "utf-8");
        } catch (Exception ex) {

        }
        return xmldoc;
    }

    public static boolean isEmpty(String str) {
        if (str == null || "".equals(str.trim()))
            return true;
        return false;
    }

    public static byte[] decodeBase64String(String imgStr) throws Exception {
        imgStr = decodeUTF8(imgStr);
        BASE64Decoder decoder = new BASE64Decoder();
        //Base64解码
        byte[] b = decoder.decodeBuffer(imgStr);
        for (int i = 0; i < b.length; ++i) {
            if (b[i] < 0) {//调整异常数据
                b[i] += 256;
            }
        }
        return b;
    }

    public static String encodeBase64String(String imageUrl) {
        if (imageUrl != null) {
            try {
                InputStream is = new FileInputStream(imageUrl);
                byte[] data = new byte[is.available()];
                is.read(data);
                is.close();
                return encodeUTF8(Base64.encodeBase64String(data));
            } catch (Exception e) {
                System.out.println(e);
                return "";
            }
        } else {
            return "";
        }
    }

    public static String encodeBase64String(byte[] image) {
        if (image != null && image.length >= 0) {
            try {
                String base64Str = Base64.encodeBase64String(image);
                return encodeUTF8(base64Str);
            } catch (Exception e) {
                System.out.println(e);
                return "";
            }
        } else {
            return "";
        }
    }

    public static String getZero(int len) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            sb.append("0");
        }
        return sb.toString();
    }


    public static String cuttingMsg(String msg) {
        if (msg.length() > 400) {
            msg = msg.substring(0, 400);
        }
        return msg;
    }

    public static void main(String[] args) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(new Date());
//        System.out.println(Calendar.MONTH);
//        System.out.printf(String.valueOf("E".indexOf("M")));
    }


}
