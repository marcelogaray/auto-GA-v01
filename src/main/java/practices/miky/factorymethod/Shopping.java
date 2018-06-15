package practices.miky.factorymethod;

import practices.miky.factorymethod.creator.PaymentFactory;

import java.util.ArrayList;

/**
 * @author Miguel Rojas
 */
public class Shopping {

    public static void main(String[] args) {
        MainPayment mainPayment = new MainPayment(PaymentFactory.TypePayment.CARD);
        mainPayment.payment(new ArrayList());

        mainPayment = new MainPayment(PaymentFactory.TypePayment.PAYPAL);
        mainPayment.payment(new ArrayList());

        mainPayment = new MainPayment(PaymentFactory.TypePayment.WIRE_TRANSFER);
        mainPayment.payment(new ArrayList());
    }
}
