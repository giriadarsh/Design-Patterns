package designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart(new RazorpayPaymentGatewayAdapter()) ;
        flipkart.makePaymentViaCC("xyz346", 867, 9, 2021);
    }




}
