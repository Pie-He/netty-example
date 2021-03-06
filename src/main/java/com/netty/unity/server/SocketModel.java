package com.netty.unity.server;

import java.util.List;

/**
 * Created by admin on 2017/10/20.
 */
public class SocketModel {
    private int type;
    private int area;
    private int command;
    private List<String> message;

    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getCommand() {
        return command;
    }
    public void setCommand(int command) {
        this.command = command;
    }
    public List<String> getMessage() {
        return message;
    }
    public void setMessage(List<String> message) {
        this.message = message;
    }
}
