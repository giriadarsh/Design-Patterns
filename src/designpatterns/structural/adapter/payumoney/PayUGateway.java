package designpatterns.structural.adapter.payumoney;

public class PayUGateway {

    public String makeCCPayment(Long creditCard,
                                  Long cvv,
                                  Long expiry){
        System.out.println("Payment done by Razorpay");
        return "123" ;
    }

    public PayUPaymentStatus checkPaymentStatus(String id){
        return PayUPaymentStatus.FAILURE ;
    }
}
