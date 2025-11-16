package factorypattern.concretecreators;

import decoratorpattern.concretedecorators.*;
import model.Meal;

public class ToppingFactory {

    public Meal addTopping(Meal base, String topping) {
        switch (topping.toLowerCase()) {
            case "cheese": return new ExtraCheese(base);
            case "sauce": return new ExtraSauce(base);
            case "jalapeno": return new ExtraJalapeno(base);
            default:
                throw new IllegalArgumentException("Unknown topping: " + topping);
        }
    }
}
