package com.big.listeners;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * 事件源
 *
 * @author Yin
 * @date 2024-10-18 10:18
 */
public class EventSource {

    public List<EventListener> listeners = new ArrayList<>();

    public void addListeners(EventListener eventListener) {
        listeners.add(eventListener);
    }

    public void doEvent() {
        for (EventListener listener : listeners) {
            if (listener instanceof MyEventListener) {
                MyEventListener eventListener = (MyEventListener) listener;
                eventListener.event(new MyObject(this));
            }
        }
    }

}
