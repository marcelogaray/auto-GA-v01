package practices.miky.factorymethod;

import practices.miky.factorymethod.creator.PaymentFactory;
import practices.miky.factorymethod.product.Payment;

import java.util.List;

/**
 * @author Miguel Rojas
 */
public class MainPayment {

    private Payment payment;

    public MainPayment(PaymentFactory.TypePayment typePayment){
        this.payment = PaymentFactory.getPayment(typePayment);
    }

    public void payment(List shoppingList){
        payment.doPayment(shoppingList);
    }
}
