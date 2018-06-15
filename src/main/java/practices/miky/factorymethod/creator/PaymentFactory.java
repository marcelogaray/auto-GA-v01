package practices.miky.factorymethod.creator;

import practices.miky.factorymethod.product.CardPayment;
import practices.miky.factorymethod.product.Payment;
import practices.miky.factorymethod.product.PaypalPayment;
import practices.miky.factorymethod.product.WireTransferPayment;

/**
 * @author Miguel Rojas
 */
public class PaymentFactory {

    public enum TypePayment {CARD, PAYPAL, WIRE_TRANSFER}

    public static Payment getPayment(TypePayment typePayment) {
        switch (typePayment) {
            case CARD:
                return new CardPayment();
            case PAYPAL:
                return new PaypalPayment();
            case WIRE_TRANSFER:
                return new WireTransferPayment();
            default:
                return new CardPayment();
        }
    }
}
