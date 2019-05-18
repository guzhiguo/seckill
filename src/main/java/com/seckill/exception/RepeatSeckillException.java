package com.seckill.exception;

/**
 * 重复秒杀异常
 * @author bill
 * @date 2019-05-1822:29
 */
public class RepeatSeckillException extends SeckillException {


    public RepeatSeckillException(String message) {
        super(message);
    }

    public RepeatSeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
