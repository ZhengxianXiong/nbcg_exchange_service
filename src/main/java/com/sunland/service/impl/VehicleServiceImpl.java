package com.sunland.service.impl;

import com.sunland.dao.IVehicleInfoDao;
import com.sunland.dao.IVehicleinfoRequestDao;
import com.sunland.pojo.VehicleInfo;
import com.sunland.pojo.VehicleinfoRequest;
import com.sunland.service.IVehicleService;
import com.sunland.utils.Constans;
import com.sunland.utils.XMLUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements IVehicleService {
    @Resource
    IVehicleInfoDao vehicleInfoDao;
    @Resource
    IVehicleinfoRequestDao vehicleinfoRequestDao;

    @Override
    public String QueryVehicleInfo(VehicleinfoRequest vr) throws Exception {
        int flag = vehicleinfoRequestDao.insert(vr);
        VehicleInfo vi = null;
        if (flag == 1) {//请求写入数据库成功
            //TODO 循环查
            List<VehicleInfo> vList = new ArrayList<>();
            int num = 0;//查询时间设置为250ms * 60 = 15s
            while (true) {
                vList = vehicleInfoDao.selectByHphm(vr.getHphm().substring(1));
                if (vList.size() > 0) break;
                Thread.sleep(250);
                if (num > 60) break;
                num++;
            }
            for (VehicleInfo v : vList) {
                if (v != null) {
                    vi = v;
                    break;
                }
            }
        }
        if (vi != null) {//成功
            vi.setIssuccess(Constans.RESPONSE_SUCCESSSTR);
            vi.setCode(Constans.RESPONSE_SUCCESS);
            vi.setErrmsg(Constans.RESPONSE_SUCCESSSTR);
        } else {//失败
            vi.setIssuccess(Constans.RESPONSE_FAILSTR);
            vi.setCode(Constans.RESPONSE_FAIL);
            vi.setErrmsg(Constans.RESPONSE_FAILSTR);
        }
        return XMLUtils.responseVehicleQuery(vi);
    }
}
