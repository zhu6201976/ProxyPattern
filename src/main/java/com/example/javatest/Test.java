package com.example.javatest;

/**
 * 代理模式（Proxy）：为其他对象提供一种代理以控制对这个对象的访问。
 * 代理模式说白了就是“真实对象”的代表，在访问对象时引入一定程度的间接性，
 * 因为这种间接性可以附加多种用途。
 */
public class Test {

    public static void main(String[] args) {

        Action userAction = new UserAction();
        Action proxyAction = new ProxyAction(userAction);
        proxyAction.doAction();

    }


}
