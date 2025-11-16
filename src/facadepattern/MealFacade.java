package facadepattern;

import builderpattern.builder.ComboBuilder;
import builderpattern.product.Combo;
import builderpattern.sides.*;
import factorypattern.concretecreators.*;
import factorypattern.concretetoppings.*;
import factorypattern.creators.BurgerCreator;
import model.Meal;

import java.util.List;

public class MealFacade {

    public Meal createBurger(String type, List<String> toppings) {

        BurgerCreator creator = switch (type.toLowerCase()) {
            case "beef" -> new BeefBurgerCreator();
            case "chicken" -> new ChickenBurgerCreator();
            case "doublebeef" -> new DoubleBeefBurgerCreator();
            case "cheeseburger" -> new CheeseBurgerCreator();
            default -> throw new IllegalArgumentException("Unknown burger type");
        };

        Meal burger = creator.createBurger();

        for (String t : toppings) {
            burger = applyTopping(burger, t);
        }

        return burger;
    }

    private Meal applyTopping(Meal burger, String topping) {

        return switch (topping.toLowerCase()) {
            case "cheese" -> new ExtraCheeseCreator().apply(burger);
            case "sauce" -> new ExtraSauceCreator().apply(burger);
            case "jalapeno" -> new ExtraJalapenoCreator().apply(burger);
            default -> burger;
        };
    }

    public Meal createDrink(String drink) {
        return switch (drink.toLowerCase()) {
            case "cola" -> new Cola();
            case "pepsi" -> new Pepsi();
            case "fanta" -> new Fanta();
            case "sprite" -> new Sprite();
            default -> throw new IllegalArgumentException("Unknown drink");
        };
    }

    public Meal createSide(String side) {
        return switch (side.toLowerCase()) {
            case "fries" -> new Fries();
            case "wedges" -> new Wedges();
            case "onionrings" -> new OnionRings();
            default -> throw new IllegalArgumentException("Unknown side");
        };
    }

    public Combo createCombo(Meal burger, Meal drink, Meal side) {
        return new ComboBuilder()
                .setBurger(burger)
                .setDrink(drink)
                .setSide(side)
                .build();
    }
}
