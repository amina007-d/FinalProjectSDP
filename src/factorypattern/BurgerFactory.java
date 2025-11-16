package factorypattern;

import factorypattern.concreteproducts.BeefBurger;
import factorypattern.concreteproducts.CheeseBurger;
import factorypattern.concreteproducts.ChickenBurger;
import factorypattern.concreteproducts.DoubleBeefBurger;
import model.Meal;

public class BurgerFactory {
    public Meal createBurger(String type) {
        return switch (type) {
            case "chicken" -> new ChickenBurger();
            case "beef" -> new BeefBurger();
            case "doublebeef" -> new DoubleBeefBurger();
            case "cheeseburger" -> new CheeseBurger();
            default -> throw new IllegalArgumentException("Unknown burger type");
        };
    }
}
