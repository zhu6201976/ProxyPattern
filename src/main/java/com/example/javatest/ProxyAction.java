package com.example.javatest;

/**
 * ProxyAction
 * Created by My on 2018/1/18.
 */

public class ProxyAction implements Action {
    private Action action;

    public ProxyAction(Action action) {
        this.action = action;
    }

    @Override
    public void doAction() {
        long startTime = System.currentTimeMillis();
        action.doAction();// 执行真正的业务
        long endTime = System.currentTimeMillis();
        System.out.println("共耗时：" + (endTime - startTime));
    }
}
