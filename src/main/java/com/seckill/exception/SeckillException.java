package com.seckill.exception;

/**
 *
 * 所有相关秒杀异常
 * @author bill
 * @date 2019-05-1822:33
 */
public class SeckillException extends  RuntimeException{


    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
