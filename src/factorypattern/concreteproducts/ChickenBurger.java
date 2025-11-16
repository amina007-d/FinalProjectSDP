package factorypattern.concreteproducts;

import model.Meal;

public class ChickenBurger implements Meal {

    private String name = "Chicken Burger";
    private float cost = 1200f;

    @Override
    public String getName() { return name; }

    @Override
    public float getCost() { return cost; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void setCost(float cost) { this.cost = cost; }
}

