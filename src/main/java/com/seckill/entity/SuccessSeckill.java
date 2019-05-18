package com.seckill.entity;

import java.util.Date;

/**
 * 秒杀成功明细表
 *
 * @author bill
 * @date 2019-05-1811:21
 */
public class SuccessSeckill {

    /**
     * 秒杀成功编号
     */
    private long seckillId;
    /**
     * 用户手机号
     */
    private long userPhone;
    /**
     * 秒杀状态 -1无效 0成功 1已付款 2已发货
     */
    private int status;
    /**
     * 创建时间
     */
    private Date createTime;


    /**
     * 秒杀成功数据 多对一
     */
    private Seckill seckill;

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessSeckill{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", status=" + status +
                ", createTime=" + createTime +
                ", seckill=" + seckill +
                '}';
    }
}
