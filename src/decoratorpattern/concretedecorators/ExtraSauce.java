package decoratorpattern.concretedecorators;

import decoratorpattern.decorator.ToppingDecorator;
import model.Meal;

public class ExtraSauce extends ToppingDecorator {

    private float price = 200f;
    private String description = " with Extra Sauce";

    public ExtraSauce(Meal meal) {
        super(meal);
    }

    @Override
    public String getName() {
        return meal.getName() + description;
    }

    @Override
    public float getCost() {
        return meal.getCost() + price;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}

