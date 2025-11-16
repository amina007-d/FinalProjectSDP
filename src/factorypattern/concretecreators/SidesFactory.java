package factorypattern.concretecreators;

import builderpattern.sides.*;
import model.Meal;

public class SidesFactory {

    public Meal createDrink(String drink) {
        switch (drink.toLowerCase()) {
            case "cola": return new Cola();
            case "pepsi": return new Pepsi();
            case "fanta": return new Fanta();
            case "sprite": return new Sprite();
            default:
                throw new IllegalArgumentException("Unknown drink: " + drink);
        }
    }

    public Meal createSide(String side) {
        switch (side.toLowerCase()) {
            case "fries": return new Fries();
            case "wedges": return new Wedges();
            case "onionrings": return new OnionRings();
            default:
                throw new IllegalArgumentException("Unknown side: " + side);
        }
    }
}
