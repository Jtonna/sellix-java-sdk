package org.jtonna.exceptions;

public class SellixException extends Exception
{
    private String data;
    private String env;
    private String error;
    private String log;
    private String message;
    private int status;

    public SellixException(String data, String env, String error, String log, String message, int status) {
        super(message);
        this.data = data;
        this.env = env;
        this.error = error;
        this.log = log;
        this.message = message;
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public String getEnv() {
        return env;
    }

    public String getError() {
        return error;
    }

    public String getLog() {
        return log;
    }

    public int getStatus() {
        return status;
    }
}