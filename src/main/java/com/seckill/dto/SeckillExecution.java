package com.seckill.dto;

import com.seckill.entity.SuccessSeckill;
import com.seckill.enums.SeckillStateEnum;

/**
 * @author bill
 * @date 2019-05-1822:24
 */
public class SeckillExecution {


    /**
     * 秒杀编号
     */
    private long seckillId;

    /**
     * 秒杀结果状态
     */
    private int state;

    /**
     * 状态表示
     */
    private String stateInfo;

    /**
     * 秒杀成功对象
     */
    private SuccessSeckill successSeckill;


    public SeckillExecution(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum seckillStateEnum, SuccessSeckill successSeckill) {
        this.seckillId = seckillId;
        this.state = seckillStateEnum.getState();
        this.stateInfo = seckillStateEnum.getSatteInfo();
        this.successSeckill = successSeckill;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum seckillStateEnum) {
        this.seckillId = seckillId;
        this.state = seckillStateEnum.getState();
        this.stateInfo = seckillStateEnum.getSatteInfo();
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successSeckill=" + successSeckill +
                '}';
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessSeckill getSuccessSeckill() {
        return successSeckill;
    }

    public void setSuccessSeckill(SuccessSeckill successSeckill) {
        this.successSeckill = successSeckill;
    }
}
