package com.big.listeners;


import java.util.EventListener;

/**
 * 监听器
 *
 * @author Yin
 * @date 2024-10-18 9:33
 */
public class MyEventListener implements EventListener {

    public void event(MyObject myObject) {
        System.out.println("监听器被触发。。。。");
    }
}
