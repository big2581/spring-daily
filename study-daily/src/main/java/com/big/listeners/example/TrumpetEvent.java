package com.big.listeners.example;

import java.util.EventObject;

/**
 * 鸣笛事件
 *
 * @author Yin
 * @date 2024-10-18 11:03
 */
public class TrumpetEvent extends EventObject {
    public TrumpetEvent(Train source) {
        super(source);
    }

    @Override
    public Train getSource() {
        return (Train) super.getSource();
    }

    @Override
    public String toString() {
        return "鸣笛事件";
    }
}
