package com.big.listeners.example;

import java.util.EventListener;

/**
 * 定义飞机事件源
 *
 * 聋子看到飞机扔炸弹就使劲跑
 *
 * @author Yin
 * @date 2024-10-18 11:01
 */
public class Warcraft extends AbstractEventSource {
    public void onBomb() {
        notice();
    }

    private void notice() {
        for (EventListener listener : getListeners()) {
            if (listener instanceof DeafListener) {
                ((DeafListener) listener).run(new BombEvent(this));
            }
        }
    }

    @Override
    public String toString() {
        return "飞机事件源";
    }
}
