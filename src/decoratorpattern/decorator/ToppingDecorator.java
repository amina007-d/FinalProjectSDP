package decoratorpattern.decorator;

import model.Meal;

public abstract class ToppingDecorator implements Meal {

    protected Meal meal;

    public ToppingDecorator(Meal meal) {
        this.meal = meal;
    }

    @Override
    public String getName() { return meal.getName(); }

    @Override
    public float getCost() { return meal.getCost(); }

    @Override
    public void setName(String name) { meal.setName(name); }

    @Override
    public void setCost(float cost) { meal.setCost(cost); }
}
