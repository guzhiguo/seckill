package com.seckill.dao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author bill
 * @date 2019-05-1813:23
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessSeckillDaoTest {

    @Resource
    private SuccessSeckillDao successSeckillDao;

    @org.junit.Test
    public void insterSuccessKilled() {
        successSeckillDao.insterSuccessKilled(1000, 18225786091L);
    }

    @org.junit.Test
    public void queryByIdWithSeckillId() {
        System.out.println("=====================");
        System.out.println(successSeckillDao.queryByIdWithSeckillId(1000, 18225786091L).toString());
        System.out.println("=====================");
    }

}