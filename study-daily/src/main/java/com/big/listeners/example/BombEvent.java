package com.big.listeners.example;

import java.util.EventObject;

/**
 * 扔炸弹事件
 *
 * @author Yin
 * @date 2024-10-18 11:02
 */
public class BombEvent extends EventObject {

    public BombEvent(Warcraft source) {
        super(source);
    }

    @Override
    public Warcraft getSource() {
        return (Warcraft) super.getSource();
    }

    @Override
    public String toString() {
        return "扔炸弹事件";
    }
}
