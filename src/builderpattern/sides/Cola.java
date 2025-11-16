package builderpattern.sides;

import model.Meal;

public class Cola implements Meal {

    private String name = "Cola";
    private float cost = 600f;

    @Override
    public String getName() { return name; }

    @Override
    public float getCost() { return cost; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void setCost(float cost) { this.cost = cost; }
}

