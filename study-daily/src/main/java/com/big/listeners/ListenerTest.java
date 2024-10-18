package com.big.listeners;

/**
 * 要监听的对象里面注入监听器
 *
 * @author Yin
 * @date 2024-10-18 9:33
 */
public class ListenerTest {


    public static void main(String[] args) {

        EventSource eventSource = new EventSource();
        MyEventListener myEventListener = new MyEventListener();

        eventSource.addListeners(myEventListener);

        eventSource.doEvent();


    }




}
