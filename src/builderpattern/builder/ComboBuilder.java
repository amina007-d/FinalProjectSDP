package builderpattern.builder;
import builderpattern.product.Combo;
import model.Meal;

public class ComboBuilder {

    private Meal burger;
    private Meal drink;
    private Meal side;

    public ComboBuilder setBurger(Meal burger) {
        this.burger = burger;
        return this;
    }

    public ComboBuilder setDrink(Meal drink) {
        this.drink = drink;
        return this;
    }

    public ComboBuilder setSide(Meal side) {
        this.side = side;
        return this;
    }

    public Combo build() {
        return new Combo(burger, side, drink);
    }
}
