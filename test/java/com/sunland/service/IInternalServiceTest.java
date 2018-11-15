package com.sunland.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by 0zy on 2017/3/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-mybatis.xml",
        "classpath:spring-transaction.xml",
        "classpath:spring-beans.xml"})
public class IInternalServiceTest {

//    @Resource
//    private IInternalService internalService;

    @Test
    public void autoCheck() throws Exception {
//        internalService.autoCheck();
    }

    /**
     * 批量跑，月份要减去 1
     *
     * @throws Exception
     */
    @Test
    public void goCheck() throws Exception {
//        Calendar calStart = Calendar.getInstance();
//        calStart.set(2017, 8, 2);//起始时间
//        Calendar calEnd = Calendar.getInstance();
//        calEnd.set(2017, 8, 5);//结束时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        String tradedate = sdf.format(calStart.getTime());
//        while (calStart.getTimeInMillis() < calEnd.getTimeInMillis()) {
//            internalService.goCheck(tradedate);
//            calStart.add(Calendar.DAY_OF_MONTH, 1);
//            tradedate = sdf.format(calStart.getTime());
//        }
    }
}
