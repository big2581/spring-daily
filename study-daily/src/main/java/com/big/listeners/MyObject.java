package com.big.listeners;

import java.util.EventObject;

/**
 * EventObject 事件父类
 * 中变量source 是事件源
 *
 * @author Yin
 * @date 2024-10-18 9:35
 */
public class MyObject extends EventObject {

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public MyObject(EventSource source) {
        super(source);
    }

}
