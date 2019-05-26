package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.entity.Seckill;
import com.seckill.exception.RepeatSeckillException;
import com.seckill.exception.SeckillCloseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author bill
 * @date 2019-05-1900:19
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class SeckillServiceTest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SeckillService seckillService;


    @Test
    public void queryById() {
        Seckill seckill = seckillService.queryById(1000);
        logger.info("seckill={}", seckill);
    }

    @Test
    public void queryAllList() {
        List<Seckill> list = seckillService.queryAll(0, 10);
        logger.info("list={}", list);
    }

    @Test
    public void exportSeckillUrl() {
        long id = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);

        logger.info("exposer={}", exposer.toString());

    }

    @Test
    public void executeSeckill() {
        long id = 1000;
        long phone = 18225786091L;

        try {
            String md5 = "83a4395bd95d40f446d559d914347df7";
            SeckillExecution seckillExecution = seckillService.executeSeckill(id, phone, md5);
            logger.info("seckillExecution={}", seckillExecution.toString());
        } catch (RepeatSeckillException e) {
            logger.error(e.getMessage());
        } catch (SeckillCloseException e) {
            logger.error(e.getMessage());
        }
        //seckillExecution=SeckillExecution{seckillId=0, state=0, stateInfo='seckill data rewrite', successSeckill=null}

    }

    @Test
    public void toSeckill() {
        long id = 1000;
        Exposer exposer = seckillService.exportSeckillUrl(id);
        if (exposer.isExposed()) {
            logger.info("exposer={}", exposer.toString());
            long pnhone = 18225786091L;
            String md5 = exposer.getMd5();
            try {
                SeckillExecution seckillExecution = seckillService.executeSeckill(id, pnhone, md5);
                logger.info("seckillExecution={}", seckillExecution.toString());
            } catch (RepeatSeckillException e) {
                logger.error(e.getMessage());
            } catch (SeckillCloseException e) {
                logger.error(e.getMessage());
            }

        } else {
            logger.warn("秒杀未开启！exposer={}", exposer);
        }

    }

    @Test
    public void executeSeckillProcedure() {
        long seckillId = 1000;
        long phone = 18225786091L;
        Exposer exposer = seckillService.exportSeckillUrl(seckillId);
        if (exposer.isExposed()) {
            String md5 = exposer.getMd5();
            SeckillExecution execution = seckillService.executeSeckillProcedure(seckillId, phone, md5);
            logger.info(execution.getStateInfo());
        }
    }

}