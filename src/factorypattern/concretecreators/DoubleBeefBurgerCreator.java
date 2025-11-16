package factorypattern.concretecreators;
import factorypattern.concreteproducts.DoubleBeefBurger;
import factorypattern.creators.BurgerCreator;
import model.Meal;

public class DoubleBeefBurgerCreator extends BurgerCreator {
    @Override
    public Meal createBurger() {
        return new DoubleBeefBurger();
    }
}

