package builderpattern.product;

import model.Meal;

public class Combo implements Meal {

    private Meal burger;
    private Meal fries;
    private Meal drink;

    private String name;
    private float cost;

    public Combo(Meal burger, Meal fries, Meal drink) {
        this.burger = burger;
        this.fries = fries;
        this.drink = drink;

        this.name = burger.getName() + " + Fries + Cola";

        this.cost = burger.getCost()
                + (fries != null ? fries.getCost() : 0)
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
    public Meal getFries() { return fries; }
    public Meal getDrink() { return drink; }
    public void setBurger(Meal burger) { this.burger = burger; }
    public void setFries(Meal fries) { this.fries = fries; }
    public void setDrink(Meal drink) { this.drink = drink; }
}

