package facadepattern;
import builderpattern.product.Combo;
import builderpattern.builder.ComboBuilder;
import factorypattern.BurgerFactory;
import factorypattern.ToppingFactory;
import factorypattern.SidesFactory;
import model.Meal;

import java.util.List;

public class MealFacade {

    private BurgerFactory burgerFactory = new BurgerFactory();
    private ToppingFactory toppingFactory = new ToppingFactory();
    private SidesFactory sidesFactory = new SidesFactory();

    public Meal createBurger(String type, List<String> toppings) {
        Meal burger = burgerFactory.createBurger(type);
        for (String topping : toppings)
            burger = toppingFactory.addTopping(burger, topping);
        return burger;
    }

    public Meal createDrink(String drink) {
        return sidesFactory.createDrink(drink);
    }

    public Meal createSide(String side) {
        return sidesFactory.createSide(side);
    }

    public Combo createCombo(Meal burger, Meal drink, Meal side) {
        return new ComboBuilder()
                .setBurger(burger)
                .setDrink(drink)
                .setSide(side)
                .build();
    }

    public BurgerFactory getBurgerFactory() {
        return burgerFactory;
    }

    public void setBurgerFactory(BurgerFactory burgerFactory) {
        this.burgerFactory = burgerFactory;
    }

    public ToppingFactory getToppingFactory() {
        return toppingFactory;
    }

    public void setToppingFactory(ToppingFactory toppingFactory) {
        this.toppingFactory = toppingFactory;
    }

    public SidesFactory getSidesFactory() {
        return sidesFactory;
    }

    public void setSidesFactory(SidesFactory sidesFactory) {
        this.sidesFactory = sidesFactory;
    }
}
