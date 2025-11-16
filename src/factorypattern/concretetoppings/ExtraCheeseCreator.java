package factorypattern.concretetoppings;
import decoratorpattern.concretedecorators.ExtraCheese;
import factorypattern.creators.ToppingCreator;
import model.Meal;

public class ExtraCheeseCreator extends ToppingCreator {

    @Override
    public Meal apply(Meal meal) {
        return new ExtraCheese(meal);
    }
}

