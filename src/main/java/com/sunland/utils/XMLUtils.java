package com.sunland.utils;

import com.sunland.pojo.VehicleInfo;
import com.sunland.pojo.VehicleinfoRequest;
import com.sunland.pojo.Vio;
import com.sunland.pojo.VioImg;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.*;

public class XMLUtils {
    public static VehicleinfoRequest parseQueryVehicleRequestXml(String xml) {
        VehicleinfoRequest vehicleinfoRequest = new VehicleinfoRequest();
        Document doc = null;
        Map<String, String> map = new HashMap<>();
        try {
            doc = DocumentHelper.parseText(xml);
            Element root = doc.getRootElement();//读根标签
            Element reqElement = root.element("REQUEST");
            List<Element> paraElementList = reqElement.elements("PARAM");
            for (Element ele : paraElementList) {
                map.put(ele.attribute("NAME").getValue(), ele.getText());
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        vehicleinfoRequest.setHphm(map.get(Constans.VEHICLE_HPHM));
        vehicleinfoRequest.setHpzl(map.get(Constans.VEHICLE_HPZL));
        return vehicleinfoRequest;
    }

    /**
     * 封装车辆信息xml
     *
     * @param vi
     * @return
     */
    public static String responseVehicleQuery(VehicleInfo vi) {
        Document doc = DocumentHelper.createDocument();
        doc.setXMLEncoding(Constans.XML_HEADER_UTF8);
        Element root = doc.addElement("ROOT");
        root.addElement(Constans.RESPONSE_IS_SUCCESS).addText(vi.getIssuccess()).addAttribute(Constans.RESPONSE_CODE, vi.getCode());
        root.addElement(Constans.RESPONSE_ERRMSG).addText(vi.getErrmsg());
        if (Constans.RESPONSE_SUCCESS.equals(vi.getCode())) {
            Element resElement = root.addElement("RESPONSE");
            resElement.addElement("LSH").addText(vi.getLsh());
            resElement.addElement("HPZL").addText(vi.getHpzl());
            resElement.addElement("HPHM").addText(vi.getHphm());
            resElement.addElement("CLPP1").addText(vi.getClpp1());
            resElement.addElement("CLXH").addText(vi.getClxh());
            resElement.addElement("CLSBDH").addText(vi.getClsbdh());
            resElement.addElement("FDJH").addText(vi.getFdjh());
            resElement.addElement("CLLX").addText(vi.getCllx());
            resElement.addElement("CSYS").addText(vi.getCsys());
            resElement.addElement("SYXZ").addText(vi.getSyxz());
            resElement.addElement("SFZMHM").addText(vi.getSfzmhm());
            resElement.addElement("SFZMMC").addText(vi.getSfzmmc());
            resElement.addElement("SYR").addText(vi.getSyr());
            resElement.addElement("CCDJRQ").addText(DateUtil.formatDateyyyyMMddHHmmss(vi.getCcdjrq()));
            resElement.addElement("YXQZ").addText(DateUtil.formatDateyyyyMMddHHmmss(vi.getYxqz()));
            resElement.addElement("FDJRQ").addText(DateUtil.formatDateyyyyMMddHHmmss(vi.getFdjrq()));
            resElement.addElement("ZSXZQH").addText(vi.getZsxzqh());
            resElement.addElement("ZSXXDZ").addText(vi.getZsxxdz());
            resElement.addElement("YZBM1").addText(vi.getYzbm1());
            resElement.addElement("LXDH").addText(vi.getLxdh());
//        resElement.addElement("ZZZ").addText(vi.getZzz());
            resElement.addElement("ZP").addText(StringUtils.encodeBase64String(vi.getZp()));
            resElement.addElement("CZY").addText(vi.getCzy());
            resElement.addElement("IMEI").addText(vi.getImei());
            resElement.addElement("CXSJ").addText(DateUtil.formatDateyyyyMMddHHmmss(vi.getCxsj()));
        }
        String responseXmlStr = doc.asXML();
        return responseXmlStr;
    }

    /**
     * 解析传递过来的案件信息报文
     *
     * @param xml 案件信息报文
     * @return vio
     */
    public static Vio parseDTVioInfoXml(String xml) {
        Vio vio = new Vio();
        Map<String, Object> map = new HashMap<>();
        try {
            Document doc = DocumentHelper.parseText(xml);
            Element root = doc.getRootElement();//读根标签
            Element reqElement = root.element("REQUEST");
            Element vdElement = reqElement.element("VIODETAIL");
            String xh = vdElement.elementTextTrim(Constans.VIO_XH);
            String ajbh = vdElement.elementTextTrim(Constans.VIO_AJBH);
            String billno = vdElement.elementTextTrim(Constans.VIO_BILLNO);
            String hpzl = vdElement.elementTextTrim(Constans.VIO_HPZL);
            String hphm = vdElement.elementTextTrim(Constans.VIO_HPHM);
            Date wfsj = DateUtil.stringToDate(vdElement.elementTextTrim(Constans.VIO_WFSJ));
            String wfxw = vdElement.elementTextTrim(Constans.VIO_WFXW);
            Integer fkje = Integer.parseInt(vdElement.elementTextTrim(Constans.VIO_FKJE));
            String cjmj1 = vdElement.elementTextTrim(Constans.VIO_CJMJ1);
            String cjmj2 = vdElement.elementTextTrim(Constans.VIO_CJMJ2);
            Integer deptid = Integer.parseInt(vdElement.elementTextTrim(Constans.VIO_DEPTID));
            String regioncode = vdElement.elementTextTrim(Constans.VIO_REGIONCODE);
            String sjly = vdElement.elementTextTrim(Constans.VIO_SJLY);
            String roadcode = vdElement.elementTextTrim(Constans.VIO_ROADCODE);
            String roadname = vdElement.elementTextTrim(Constans.VIO_ROADNAME);
            String lrr = vdElement.elementTextTrim(Constans.VIO_LRR);
            Date lrsj = DateUtil.stringToDate(vdElement.elementTextTrim(Constans.VIO_LRSJ));
            String bz = vdElement.elementTextTrim(Constans.VIO_BZ);
            vio.setXh(xh == null ? "" : xh);
            vio.setAjbh(ajbh == null ? "" : ajbh);
            vio.setBillno(billno == null ? "" : billno);
            vio.setHpzl(hpzl == null ? "" : hpzl);
            vio.setHphm(hphm == null ? "" : hphm);
            vio.setWfsj(wfsj == null ? null : wfsj);
            vio.setWfxw(wfxw == null ? "" : wfxw);
            vio.setFkje(fkje == null ? null : fkje);
            vio.setCjmj1(cjmj1 == null ? "" : cjmj1);
            vio.setCjmj2(cjmj2 == null ? "" : cjmj2);
            vio.setDeptid(deptid == null ? null : deptid);
            vio.setRegioncode(regioncode == null ? "" : regioncode);
            vio.setSjly(sjly == null ? "" : sjly);
            vio.setRoadcode(roadcode == null ? "" : roadcode);
            vio.setRoadname(roadname == null ? "" : roadname);
            vio.setLrr(lrr == null ? "" : lrr);
            vio.setLrsj(lrsj == null ? null : lrsj);
            vio.setBz(bz == null ? "" : bz);

            Element imgElement = reqElement.element("VIOIMG");
            List<Element> imgEleList = imgElement.elements();
            List<VioImg> vioImgList = new ArrayList<>();
            for (Element ele : imgEleList) {
                String imgStr = ele.getText().trim();
                VioImg vioImg = new VioImg();
                vioImg.setContent(StringUtils.decodeBase64String(imgStr));
                vioImgList.add(vioImg);
            }
            vio.setImgList(vioImgList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vio;
    }

    /**
     * 封装返回给东投的写入结果信息
     *
     * @param vio
     * @return
     */
    public static String responseDT(Vio vio) {
        Document doc = DocumentHelper.createDocument();
        doc.setXMLEncoding(Constans.XML_HEADER_UTF8);
        Element root = doc.addElement("ROOT");
        System.out.println(vio.getIssuccess() + "---" + vio.getErrmsg() + "---" + vio.getCode());
        root.addElement(Constans.RESPONSE_IS_SUCCESS).addText(vio.getIssuccess()).addAttribute(Constans.RESPONSE_CODE, vio.getCode());
        root.addElement(Constans.RESPONSE_ERRMSG).addText(vio.getErrmsg());
        if (Constans.RESPONSE_SUCCESS.equals(vio.getCode())) {
            Element resElement = root.addElement("RESPONSE");
            resElement.addElement(Constans.VIO_XH).addText(vio.getXh());
            resElement.addElement(Constans.VIO_VIOID).addText(String.valueOf(vio.getVioid()));
        }
        String responseXmlStr = doc.asXML();
        return responseXmlStr;
    }
}
