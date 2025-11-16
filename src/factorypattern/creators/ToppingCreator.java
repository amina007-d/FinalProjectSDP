package factorypattern.creators;

import model.Meal;

public abstract class ToppingCreator {
    public abstract Meal apply(Meal meal);
}
