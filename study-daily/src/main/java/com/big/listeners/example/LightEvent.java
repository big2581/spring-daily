package com.big.listeners.example;

import java.util.EventObject;

/**
 * 开灯事件
 *
 * @author Yin
 * @date 2024-10-18 11:03
 */
public class LightEvent extends EventObject {

    public LightEvent(Train source) {
        super(source);
    }

    @Override
    public Train getSource() {
        return (Train) super.getSource();
    }

    @Override
    public String toString() {
        return "开灯事件";
    }
}
