package com.big.listeners.example;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * 事件源抽象类，包含监听器集合
 *
 * @author Yin
 * @date 2024-10-18 10:53
 */
public abstract class AbstractEventSource {

    List<EventListener> listenerList = new ArrayList<>();


    public void addListeners(List<EventListener> listenerList) {
        this.listenerList.addAll(listenerList);
    }

    public void addListener(EventListener listener) {
        this.listenerList.add(listener);
    }

    public List<EventListener> getListeners() {
        return this.listenerList;
    }
}
