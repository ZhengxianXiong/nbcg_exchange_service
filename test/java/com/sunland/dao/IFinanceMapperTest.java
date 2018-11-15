package com.sunland.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 0zy
 * @create 2017-12-13 15:16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "classpath:spring-mybatis.xml",
        "classpath:spring-cxf.xml",
        "classpath:spring-transaction.xml"})
public class IFinanceMapperTest {

    @Test
    public void testRepace() {

    }
}
