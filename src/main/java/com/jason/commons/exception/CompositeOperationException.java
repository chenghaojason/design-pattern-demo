package com.jason.commons.exception;

/**
 * 组合模式中的操作异常
 *
 * @author ChenHol.Wong
 * @create 2020/2/8 15:16
 */
public class CompositeOperationException extends Exception {

    public CompositeOperationException(String message) {
        super(message);
    }

    public CompositeOperationException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
