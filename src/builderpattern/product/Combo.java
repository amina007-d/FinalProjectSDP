package builderpattern.product;

import model.Meal;

public class Combo implements Meal {

    private Meal burger;
    private Meal sides;
    private Meal drink;

    private String name;
    private float cost;

    public Combo(Meal burger, Meal sides, Meal drink) {
        this.burger = burger;
        this.sides = sides;
        this.drink = drink;

        this.name = burger.getName() + " + Sides + Drink";

        this.cost = burger.getCost()
                + (sides != null ? sides.getCost() : 0)
                + (drink != null ? drink.getCost() : 0);
    }

    @Override
    public String getName() { return name; }

    @Override
    public float getCost() { return cost; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public void setCost(float cost) { this.cost = cost; }

    public Meal getBurger() { return burger; }
    public Meal getSides() { return sides; }
    public Meal getDrink() { return drink; }
    public void setBurger(Meal burger) { this.burger = burger; }
    public void setSides(Meal fries) { this.sides = fries; }
    public void setDrink(Meal drink) { this.drink = drink; }
}

