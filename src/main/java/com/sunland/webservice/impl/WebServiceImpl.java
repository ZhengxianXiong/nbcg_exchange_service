package com.sunland.webservice.impl;

import com.sunland.pojo.VehicleinfoRequest;
import com.sunland.pojo.Vio;
import com.sunland.service.IVehicleService;
import com.sunland.service.IVioService;
import com.sunland.utils.XMLUtils;
import com.sunland.webservice.IWebService;

import javax.annotation.Resource;
import javax.jws.WebService;

@WebService(
        endpointInterface = "com.sunland.webservice.IWebService",
        targetNamespace = "http://webservice.sunland.com/"
)
public class WebServiceImpl implements IWebService {
    @Resource
    IVioService vioService;
    @Resource
    IVehicleService vehicleService;

    @Override
    public String PushVioInfo(String requestXml) throws Exception {
        Vio vio = XMLUtils.parseDTVioInfoXml(requestXml);
        String result = vioService.insertVio(vio);
        return result;
    }

    @Override
    public String QueryVehicleInfo(String requestXml) throws Exception {
        //解析xml报文
        VehicleinfoRequest vr = XMLUtils.parseQueryVehicleRequestXml(requestXml);
        System.out.println("车辆信息：" + vr);
        String result = vehicleService.QueryVehicleInfo(vr);
        return result;
    }
}
