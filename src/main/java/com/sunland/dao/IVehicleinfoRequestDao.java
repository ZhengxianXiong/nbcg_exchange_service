package com.sunland.dao;

import com.sunland.pojo.VehicleinfoRequest;

public interface IVehicleinfoRequestDao {
    int deleteByPrimaryKey(String pid);

    int insert(VehicleinfoRequest record);

    int insertSelective(VehicleinfoRequest record);

    VehicleinfoRequest selectByPrimaryKey(String pid);

    int updateByPrimaryKeySelective(VehicleinfoRequest record);

    int updateByPrimaryKey(VehicleinfoRequest record);
}