package factorypattern.concretecreators;

import factorypattern.concreteproducts.*;
import model.Meal;

public class BurgerFactory {

    public Meal createBurger(String type) {
        switch (type.toLowerCase()) {
            case "chicken": return new ChickenBurger();
            case "beef": return new BeefBurger();
            case "doublebeef": return new DoubleBeefBurger();
            case "cheeseburger": return new CheeseBurger();
            default:
                throw new IllegalArgumentException("Unknown burger type: " + type);
        }
    }
}
