package factorypattern.concretecreators;
import factorypattern.concreteproducts.BeefBurger;
import factorypattern.creators.BurgerCreator;
import model.Meal;

public class BeefBurgerCreator extends BurgerCreator {
    @Override
    public Meal createBurger() {
        return new BeefBurger();
    }
}

