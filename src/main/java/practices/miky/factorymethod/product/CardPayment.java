package practices.miky.factorymethod.product;

import java.util.List;

/**
 * @author Miguel Rojas
 */
public class CardPayment implements Payment {

    @Override
    public void doPayment(List shoppingList) {
        System.out.println("Pago con Card..");
    }
}
