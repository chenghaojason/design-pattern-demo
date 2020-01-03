package com.jason.commons.exception;

/**
 * @author ChenHol.Wong
 * @create 2019/12/24 - 20:28
 */
public class NewInstanceException extends Exception {
    private String className;

    public NewInstanceException(String message) {
        super(message);
    }

    public NewInstanceException(String className, String message) {
        super(className + message);
        this.className = className;
    }

    public NewInstanceException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public NewInstanceException(String className, String message, Throwable throwable) {
        super("[" + className + "] " + message, throwable);
        this.className = className;
    }

}
