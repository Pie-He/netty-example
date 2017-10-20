package com.netty.helloworld;

import java.io.Serializable;

/**
 * Created by admin on 2017/10/20.
 */
public class Command implements Serializable {

    private static final long serialVersionUID = 7590999461767050471L;

    private String actionName;

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }
}
