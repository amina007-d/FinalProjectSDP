package factorypattern.concretecreators;
import factorypattern.concreteproducts.ChickenBurger;
import factorypattern.creators.BurgerCreator;
import model.Meal;

public class ChickenBurgerCreator extends BurgerCreator {
    @Override
    public Meal createBurger() {
        return new ChickenBurger();
    }
}

