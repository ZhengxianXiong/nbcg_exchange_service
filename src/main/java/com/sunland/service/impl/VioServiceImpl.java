package com.sunland.service.impl;

import com.sunland.dao.IVioDao;
import com.sunland.dao.IVioImgDao;
import com.sunland.pojo.Vio;
import com.sunland.pojo.VioImg;
import com.sunland.service.IVioService;
import com.sunland.utils.Constans;
import com.sunland.utils.XMLUtils;
import org.springframework.jdbc.support.incrementer.DataFieldMaxValueIncrementer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

@Service
public class VioServiceImpl implements IVioService {
    @Resource
    IVioDao vioDao;
    @Resource
    IVioImgDao vioImgDao;
    @Resource
    private DataFieldMaxValueIncrementer unitIniIncre;

    @Override
    public String insertVio(Vio vio) {
        Integer vioid = unitIniIncre.nextIntValue();
        vio.setVioid(vioid);
        vioDao.insertSelective(vio);
        int i = 1;
        for (VioImg img : vio.getImgList()) {
            img.setImgindex(i);
            img.setVioid(vioid);
            img.setJllx("1");
            img.setInserttime(new Date());
            img.setUpdatetime(new Date());
            vioImgDao.insertSelective(img);
            i++;
        }
        Vio v = vioDao.selectByPrimaryKey(vioid);
        v.setXh(vio.getXh());
        if (v != null) {//写入成功
            v.setIssuccess(Constans.RESPONSE_SUCCESSSTR);
            v.setCode(Constans.RESPONSE_SUCCESS);
            v.setErrmsg(Constans.RESPONSE_SUCCESSSTR);
        } else {//写入失败
            v.setIssuccess(Constans.RESPONSE_FAILSTR);
            v.setCode(Constans.RESPONSE_FAIL);
            v.setErrmsg(Constans.RESPONSE_FAILSTR);
        }
        return XMLUtils.responseDT(v);
    }
}
