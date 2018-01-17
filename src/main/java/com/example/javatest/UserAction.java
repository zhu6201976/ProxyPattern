package com.example.javatest;

/**
 * UserAction
 * Created by My on 2018/1/18.
 */

public class UserAction implements Action {
    @Override
    public void doAction() {
        for (int i = 0; i < 100; i++) {
            System.out.println("用户开始工作了...");
        }
    }
}
