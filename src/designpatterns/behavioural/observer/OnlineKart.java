package designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnlineKart {

    private static Map<Events, List<Subscriber>> subscribers = new HashMap<>();

    public static void registerSubscriber(Events events, Subscriber subscriber) {
        if(!subscribers.containsKey(events)) {
            subscribers.put(events, new ArrayList<>());
        }

        subscribers.get(events).add(subscriber);
    }

    public void notifySubscribers(Events event, Order order) {
        for (Subscriber subscriber : subscribers.get(event)) {
            subscriber.listen(event, order);
        }
    }

    public void placeOrder(Order order) {
        notifySubscribers(Events.ORDER_PLACED, order);
    }
}
