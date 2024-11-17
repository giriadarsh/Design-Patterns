package designpatterns.structural.adapter;

import designpatterns.structural.adapter.payumoney.PayUGateway;
import designpatterns.structural.adapter.payumoney.PayUPaymentStatus;
import designpatterns.structural.adapter.razorpay.RazorpayGateway;

public class PayUPaymentGatewayAdaptor implements PaymentGateway {

    private PayUGateway payUGateway = new PayUGateway();

    @Override
    public Long payViaCC(String cardNumber, int cvv, int expiryMonth, int expiryYear) {
        Long creditCard = Long.parseLong(cardNumber) ;
        Long cvvReq = (long) cvv ;
        Long expiry = (long) expiryMonth ;

        String answer = payUGateway.makeCCPayment(creditCard, cvvReq, expiry);
        return Long.parseLong(answer);
    }

    @Override
    public PaymentStatus getStatus(Long id) {

        PayUPaymentStatus status = payUGateway.checkPaymentStatus(String.valueOf(id));

        if(status == PayUPaymentStatus.SUCCESS)
            return PaymentStatus.SUCCESS ;
        else return PaymentStatus.FAILURE ;
    }
}
