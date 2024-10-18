package com.big.listeners.example;

import java.util.EventListener;

/**
 * 瞎子，监听火车鸣笛
 *
 * @author Yin
 * @date 2024-10-18 11:04
 */
public class BlindListener implements EventListener {

    private String person;

    public BlindListener(String person) {
        this.person = person;
    }

    public void sing(TrumpetEvent event) {
        System.err.println(event + "被触发了，事件源为：" + event.getSource());
        System.err.println("The " + person + " start sing");
    }
}
