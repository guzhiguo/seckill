package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * @author bill
 * @date 2019-05-1813:24
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SeckillDaoTest {


    @Resource
    private SeckillDao seckillDao;

    @org.junit.Test
    public void reduceNumber() {
        System.out.println("======================");
        System.out.println(seckillDao.reduceNumber(1000, new Date()));
        System.out.println("======================");
    }

    @org.junit.Test
    public void queryById() {

        long id = 1000;
        Seckill seckill = seckillDao.queryById(id);
        System.out.println("======================");
        System.out.println(seckill.toString());
        System.out.println("======================");

    }

    @org.junit.Test
    public void queryAll() {
        List<Seckill> list = seckillDao.queryAll(0, 100);
        System.out.println("======================");

        for (Seckill seckill : list) {
            System.out.println(seckill.toString());
        }

        System.out.println("======================");
    }
}