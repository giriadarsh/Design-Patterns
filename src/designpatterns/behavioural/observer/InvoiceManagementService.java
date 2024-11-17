package designpatterns.behavioural.observer;

import designpatterns.structural.adapter.Flipkart;

public class InvoiceManagementService implements Subscriber <Order>{

    InvoiceManagementService() {
        OnlineKart.registerSubscriber(Events.ORDER_PLACED, this);
    }

    @Override
    public void listen(Events event, Order order) {
        generateInvoice(order);
    }

    public void generateInvoice(Order order){
        System.out.println("Generating invoice for order");
    }
}
