package com.big.listeners.example;

import java.util.EventListener;

/**
 * 聋子，监听火车开灯、飞机扔炸弹
 *
 * @author Yin
 * @date 2024-10-18 11:05
 */
public class DeafListener implements EventListener {

    private String person;

    public DeafListener(String person) {
        this.person = person;
    }

    public void dance(LightEvent event) {
        System.err.println(event + "被触发了，事件源为：" + event.getSource());
        System.err.println("The " + person + " start dance");
    }

    public void run(BombEvent event) {
        System.err.println(event + "被触发了，事件源为：" + event.getSource());
        System.err.println("The " + person + " start run");
    }
}
