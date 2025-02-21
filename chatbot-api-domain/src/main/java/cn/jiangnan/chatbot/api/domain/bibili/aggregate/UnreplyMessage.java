package cn.jiangnan.chatbot.api.domain.bibili.aggregate;

import cn.jiangnan.chatbot.api.domain.bibili.res.Data;

public class UnreplyMessage {
    private int code;
    private String message;
    private int ttl;
    private Data data;

    // Constructor
    public UnreplyMessage(int code, String message, int ttl, Data data) {
        this.code = code;
        this.message = message;
        this.ttl = ttl;
        this.data = data;
    }

    // Getters and Setters
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
