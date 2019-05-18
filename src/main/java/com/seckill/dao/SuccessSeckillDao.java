package com.seckill.dao;

import com.seckill.entity.SuccessSeckill;
import org.apache.ibatis.annotations.Param;

/**
 * @author bill
 * @date 2019-05-1811:29
 */
public interface SuccessSeckillDao {

    /**
     * 插入秒杀成功的数据
     *
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insterSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);


    /**
     * 根据id查询successKilled信息并携带秒杀产品对对象
     *
     * @param seckillId
     * @return
     */
    SuccessSeckill queryByIdWithSeckillId(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

}
