package com.big.listeners.example;

import java.util.EventListener;

/**
 * 火车事件源
 *
 * 瞎子听到火车鸣笛就唱歌
 * 聋子看到火车开灯就跳舞
 *
 * @author Yin
 * @date 2024-10-18 10:58
 */
public class Train extends AbstractEventSource {

    private static final int LISTENER_TYPE_BLIND = 1;
    private static final int LISTENER_TYPE_DEAF = 2;

    public void onTrumpet() {
        notice(LISTENER_TYPE_BLIND);
    }

    public void onLight() {
        notice(LISTENER_TYPE_DEAF);
    }

    private void notice(int listenerType) {
        for (EventListener listener : getListeners()) {

            if (LISTENER_TYPE_BLIND == listenerType &&
                    listener instanceof BlindListener) {

                ((BlindListener) listener).sing(new TrumpetEvent(this));

            } else if (LISTENER_TYPE_DEAF == listenerType
                    && listener instanceof DeafListener) {

                ((DeafListener) listener).dance(new LightEvent(this));
            }
        }
    }

    @Override
    public String toString() {
        return "火车事件源";
    }
}
