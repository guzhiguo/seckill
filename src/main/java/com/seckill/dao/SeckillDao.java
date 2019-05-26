package com.seckill.dao;

import com.seckill.entity.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author bill
 * @date 2019-05-1811:25
 */
public interface SeckillDao {

    /**
     * 减库存
     *
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

    /**
     * 根据秒杀编号查询秒杀商品数据
     *
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 查询可秒杀商品列表
     *
     * @param offset
     * @param limit
     * @return
     */
    List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 使用存储过程完成秒杀
     *
     * @param map
     */
    void kellByProcedure(Map<String, Object> map);


}
