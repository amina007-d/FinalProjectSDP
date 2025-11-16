package factorypattern.concretetoppings;
import decoratorpattern.concretedecorators.ExtraSauce;
import factorypattern.creators.ToppingCreator;
import model.Meal;

public class ExtraSauceCreator extends ToppingCreator {

    @Override
    public Meal apply(Meal meal) {
        return new ExtraSauce(meal);
    }
}

