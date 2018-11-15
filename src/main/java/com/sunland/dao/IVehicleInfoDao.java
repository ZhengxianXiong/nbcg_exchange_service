package com.sunland.dao;

import com.sunland.pojo.VehicleInfo;

import java.util.List;

public interface IVehicleInfoDao {

    public List<VehicleInfo> selectByHphm(String hphm);

    int deleteByPrimaryKey(String lsh);

    int insert(VehicleInfo record);

    int insertSelective(VehicleInfo record);

    VehicleInfo selectByPrimaryKey(String lsh);

    int updateByPrimaryKeySelective(VehicleInfo record);

    int updateByPrimaryKeyWithBLOBs(VehicleInfo record);

    int updateByPrimaryKey(VehicleInfo record);
}