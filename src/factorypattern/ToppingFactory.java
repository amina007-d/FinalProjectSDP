package factorypattern;

import decoratorpattern.concretedecorators.ExtraCheese;
import decoratorpattern.concretedecorators.ExtraSauce;
import model.Meal;

public class ToppingFactory {

    public Meal addTopping(Meal base, String topping) {
        switch (topping.toLowerCase()) {
            case "cheese":
                return new ExtraCheese(base);
            case "sauce":
                return new ExtraSauce(base);
            default:
                throw new IllegalArgumentException("Unknown topping: " + topping);
        }
    }
}

