package factorypattern.concreteproducts;

import model.Meal;

public class BeefBurger implements Meal {

    private String name = "Beef Burger";
    private float cost = 1400f;

    @Override
    public String getName() { return name; }

    @Override
    public float getCost() { return cost; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void setCost(float cost) { this.cost = cost; }
}

