package com.big.listeners.example;

import java.util.*;

/**
 *
 * 瞎子听到火车鸣笛就唱歌，瞎子对火车鸣笛感兴趣，感兴趣导致的结果就是唱歌。
 * 聋子看到火车开灯就跳舞，聋子对火车开灯感兴趣，感兴趣导致的结果就是跳舞。
 * 聋子看到飞机扔炸弹就使劲跑，聋子对飞机扔炸弹感兴趣，感兴趣导致的结果就是使劲跑。
 *
 * @author Yin
 * @date 2024-10-18 10:57
 */
public class ExampleListenerTest {

    public static void main(String[] args) {

        Train train = new Train();
        Warcraft warcraft = new Warcraft();

        List<EventListener> listeners = new ArrayList() {{
            add(new BlindListener("瞎子A"));
            add(new BlindListener("瞎子B"));
            add(new DeafListener("聋子A"));
            add(new DeafListener("聋子B"));
        }};

        train.addListeners(listeners);
        warcraft.addListeners(listeners);

        train.onTrumpet();
        System.err.println("====");
        train.onLight();
        System.err.println("====");
        warcraft.onBomb();
    }
}
