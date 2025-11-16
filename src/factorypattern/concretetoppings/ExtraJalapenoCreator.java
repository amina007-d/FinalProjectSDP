package factorypattern.concretetoppings;
import decoratorpattern.concretedecorators.ExtraJalapeno;
import factorypattern.creators.ToppingCreator;
import model.Meal;

public class ExtraJalapenoCreator extends ToppingCreator {

    @Override
    public Meal apply(Meal meal) {
        return new ExtraJalapeno(meal);
    }
}

