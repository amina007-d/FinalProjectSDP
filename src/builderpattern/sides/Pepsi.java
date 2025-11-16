package builderpattern.sides;

import model.Meal;

public class Pepsi implements Meal {

    private String name = "Pepsi";
    private float cost = 350;

    @Override
    public String getName() { return name; }
    @Override
    public float getCost() { return cost; }
    @Override
    public void setName(String name) { this.name = name; }
    @Override
    public void setCost(float cost) { this.cost = cost; }
}
