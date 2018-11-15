package com.sunland.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IWebService {
    /**
     * 推送案件数据
     *
     * @param requestXml
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "Push_VioInfo")
    @WebResult(name = "result")
    String PushVioInfo(@WebParam(name = "requestXml") String requestXml) throws Exception;

    /**
     * 查询车辆信息
     *
     * @param requestXml
     * @return
     * @throws Exception
     */
    @WebMethod(operationName = "Query_VehicleInfo")
    @WebResult(name = "result")
    String QueryVehicleInfo(@WebParam(name = "requestXml") String requestXml) throws Exception;


}
