package factorypattern.concretecreators;
import factorypattern.concreteproducts.CheeseBurger;
import factorypattern.creators.BurgerCreator;
import model.Meal;

public class CheeseBurgerCreator extends BurgerCreator {
    @Override
    public Meal createBurger() {
        return new CheeseBurger();
    }
}

