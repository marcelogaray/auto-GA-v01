package practices.miky.factorymethod.product;

import java.util.List;

/**
 * @author Miguel Rojas
 */
public class WireTransferPayment implements Payment {
    @Override
    public void doPayment(List shoppingList) {
        System.out.println("Pago por transferencia bancaria...");
    }
}
