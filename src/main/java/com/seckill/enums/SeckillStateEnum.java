package com.seckill.enums;

/**
 * @author bill
 * @date 2019-05-1823:17
 */
public enum SeckillStateEnum {

    SUCCESS(1, "秒杀成功"),
    END(0, "秒杀结束"),
    REPEAT_KILL(-1, "重复秒杀"),
    INNER_ERROR(-2, "秒杀异常"),
    DATA_REWRITE(-3, "数据篡改");

    /**
     * 秒杀结果状态
     */
    private int state;
    /**
     * 状态信息
     */
    private String satteInfo;

    SeckillStateEnum(int state, String satteInfo) {
        this.state = state;
        this.satteInfo = satteInfo;
    }

    public static SeckillStateEnum stateEnum(int index) {
        for (SeckillStateEnum seckillStateEnum : values()) {
            if (seckillStateEnum.getState() == index) {
                return seckillStateEnum;
            }
        }
        return null;
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSatteInfo() {
        return satteInfo;
    }

    public void setSatteInfo(String satteInfo) {
        this.satteInfo = satteInfo;
    }}
