import facadepattern.MealFacade;
import facadepattern.OrderFacade;
import model.Meal;
import model.Order;
import observerpattern.concretesubscribers.CustomerListener;
import observerpattern.concretesubscribers.KitchenListener;
import strategypattern.concretepayment.CardPayment;
import strategypattern.concretepayment.CashPayment;
import strategypattern.concretepayment.QRPayment;
import strategypattern.payment.PaymentStrategy;

import java.util.*;

public class RestaurantApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        MealFacade mealFacade = new MealFacade();
        OrderFacade orderFacade = new OrderFacade();

        orderFacade.addListener(new KitchenListener());
        orderFacade.addListener(new CustomerListener());

        Map<String, Order> orders = new HashMap<>();

        while (true) {

            System.out.println("\n======== RESTAURANT SYSTEM ========");
            System.out.println("1. Create Burger Order");
            System.out.println("2. Create Combo Order");
            System.out.println("3. Pay for Order");
            System.out.println("4. Show All Orders");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                String burgerType = chooseBurger(scanner);
                List<String> toppings = chooseToppings(scanner);

                Meal burger = mealFacade.createBurger(burgerType, toppings);
                Order order = orderFacade.createOrder(burger);

                orderFacade.startCooking(order);
                orderFacade.finishCooking(order);

                orders.put(order.getId(), order);

                System.out.println("Order created! ID = " + order.getId());
            }

            else if (choice == 2) {

                String burgerType = chooseBurger(scanner);
                List<String> toppings = chooseToppings(scanner);

                Meal burger = mealFacade.createBurger(burgerType, toppings);

                String drinkType = chooseDrink(scanner);
                Meal drink = mealFacade.createDrink(drinkType);

                String sideType = chooseSide(scanner);
                Meal side = mealFacade.createSide(sideType);

                Meal combo = mealFacade.createCombo(burger, drink, side);

                Order order = orderFacade.createOrder(combo);

                orderFacade.startCooking(order);
                orderFacade.finishCooking(order);

                orders.put(order.getId(), order);

                System.out.println("Combo created! ID = " + order.getId());
            }

            else if (choice == 3) {
                System.out.print("Enter Order ID: ");
                String id = scanner.nextLine();

                Order order = orders.get(id);
                if (order == null) {
                    System.out.println("Order not found!");
                    continue;
                }

                PaymentStrategy strategy = choosePayment(scanner);
                orderFacade.payOrder(order, strategy);
            }

            else if (choice == 4) {
                System.out.println("\n=== ALL ORDERS ===");
                for (Order o : orders.values()) {
                    System.out.println(
                            o.getId() + " | " +
                                    o.getMeal().getName() + " | " +
                                    o.getMeal().getCost() + " KZT | " +
                                    "status=" + o.getStatus()
                    );
                }
            }

            else if (choice == 5) {
                System.out.println("Goodbye!");
                break;
            }
        }

        scanner.close();
    }

    private static String chooseBurger(Scanner scanner) {
        System.out.println("\nChoose burger:");
        System.out.println("1. Beef");
        System.out.println("2. Chicken");
        System.out.println("3. DoubleBeef");
        System.out.println("4. CheeseBurger");
        System.out.print("Your choice: ");

        int b = scanner.nextInt();
        scanner.nextLine();

        return switch (b) {
            case 1 -> "beef";
            case 2 -> "chicken";
            case 3 -> "doublebeef";
            case 4 -> "cheeseburger";
            default -> "beef";
        };
    }

    private static List<String> chooseToppings(Scanner scanner) {
        List<String> toppings = new ArrayList<>();

        System.out.print("Add Extra Cheese? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes"))
            toppings.add("cheese");

        System.out.print("Add Sauce? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes"))
            toppings.add("sauce");

        return toppings;
    }

    private static String chooseDrink(Scanner scanner) {
        System.out.println("\nChoose drink:");
        System.out.println("1. Cola");
        System.out.println("2. Pepsi");
        System.out.println("3. Fanta");
        System.out.println("4. Sprite");
        System.out.print("Your choice: ");

        int d = scanner.nextInt();
        scanner.nextLine();

        return switch (d) {
            case 1 -> "cola";
            case 2 -> "pepsi";
            case 3 -> "fanta";
            case 4 -> "sprite";
            default -> "cola";
        };
    }

    private static String chooseSide(Scanner scanner) {
        System.out.println("\nChoose side:");
        System.out.println("1. Fries");
        System.out.println("2. Wedges");
        System.out.println("3. Onion Rings");
        System.out.print("Your choice: ");

        int s = scanner.nextInt();
        scanner.nextLine();

        return switch (s) {
            case 1 -> "fries";
            case 2 -> "wedges";
            case 3 -> "onionrings";
            default -> "fries";
        };
    }

    private static PaymentStrategy choosePayment(Scanner scanner) {
        System.out.println("\nChoose payment:");
        System.out.println("1. Cash");
        System.out.println("2. Card");
        System.out.println("3. QR");

        int p = scanner.nextInt();
        scanner.nextLine();

        return switch (p) {
            case 1 -> new CashPayment();
            case 2 -> new CardPayment();
            case 3 -> new QRPayment();
            default -> new CashPayment();
        };
    }
}
