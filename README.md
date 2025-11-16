# Restaurant Management System

A comprehensive Java-based restaurant ordering system demonstrating the implementation of 6 essential design patterns.

## Project Overview

This project implements a fully functional restaurant management system that handles burger orders, combo meals, payment processing, and delivery services. The system showcases best practices in object-oriented design through the strategic use of design patterns.

## Design Patterns Implemented

### 1. **Factory Pattern**
- **Location**: `factorypattern` package
- **Purpose**: Creates different types of burgers, sides, drinks, and toppings
- **Classes**:
    - `BurgerFactory` - Creates burger instances (Beef, Chicken, Double Beef, Cheeseburger)
    - `SidesFactory` - Creates sides and drinks (Fries, Wedges, Onion Rings, Cola, Pepsi, etc.)
    - `ToppingFactory` - Adds toppings to meals

### 2. **Builder Pattern**
- **Location**: `builderpattern` package
- **Purpose**: Constructs complex Combo objects with optional components
- **Classes**:
    - `ComboBuilder` - Builds combo meals with burger, drink, and side
    - `Combo` - Product class representing a complete combo meal

### 3. **Decorator Pattern**
- **Location**: `decoratorpattern` package
- **Purpose**: Dynamically adds toppings to burgers without modifying base classes
- **Classes**:
    - `ToppingDecorator` - Abstract decorator for meal enhancements
    - `ExtraCheese` - Adds cheese topping (300 KZT)
    - `ExtraSauce` - Adds sauce topping (200 KZT)
    - `ExtraJalapeno` - Adds jalapeno topping (300 KZT)

### 4. **Strategy Pattern**
- **Location**: `strategypattern` package
- **Purpose**: Enables flexible payment and delivery methods
- **Classes**:
    - **Payment Strategies**: `CardPayment`, `CashPayment`, `QRPayment`
    - **Delivery Strategies**: `CourierDelivery`, `DroneDelivery`, `PickupDelivery`

### 5. **Observer Pattern**
- **Location**: `observerpattern` package
- **Purpose**: Notifies multiple listeners about order status changes
- **Classes**:
    - `OrderService` - Publisher that manages order events
    - `OrderListener` - Subscriber interface
    - `CustomerListener` - Notifies customers about order updates
    - `KitchenListener` - Notifies kitchen staff about new orders

### 6. **Facade Pattern**
- **Location**: `facadepattern` package
- **Purpose**: Provides simplified interfaces to complex subsystems
- **Classes**:
    - `MealFacade` - Simplifies meal creation (burgers, combos, drinks, sides)
    - `OrderFacade` - Simplifies order management (create, pay, cook, deliver)

### 7. **Model Classes**
- **Location**: `model` package
- **Purpose**: Core domain models
- **Classes**:
    - `Meal` - Interface for all meal items
    - `Order` - Order entity with unique ID
    - `OrderStatus` - Enum (CREATED, COOKING, READY, PAID)

## Project Structure

```
src/
├── builderpattern/
│   ├── builder/
│   │   └── ComboBuilder.java
│   ├── product/
│   │   └── Combo.java
│   └── sides/
│       ├── Cola.java
│       ├── Fanta.java
│       ├── Fries.java
│       ├── OnionRings.java
│       ├── Pepsi.java
│       ├── Sprite.java
│       └── Wedges.java
├── decoratorpattern/
│   ├── decorator/
│   │   └── ToppingDecorator.java
│   └── concretedecorators/
│       ├── ExtraCheese.java
│       ├── ExtraJalapeno.java
│       └── ExtraSauce.java
├── facadepattern/
│   ├── MealFacade.java
│   └── OrderFacade.java
├── factorypattern/
│   ├── concretecreators/
│   │   ├── BurgerFactory.java
│   │   ├── SidesFactory.java
│   │   └── ToppingFactory.java
│   └── concreteproducts/
│       ├── BeefBurger.java
│       ├── CheeseBurger.java
│       ├── ChickenBurger.java
│       └── DoubleBeefBurger.java
├── model/
│   ├── Meal.java
│   ├── Order.java
│   └── OrderStatus.java
├── observerpattern/
│   ├── publisher/
│   │   └── OrderService.java
│   ├── subscriber/
│   │   └── OrderListener.java
│   └── concretesubscribers/
│       ├── CustomerListener.java
│       └── KitchenListener.java
├── strategypattern/
│   ├── payment/
│   │   └── PaymentStrategy.java
│   ├── concretepayment/
│   │   ├── CardPayment.java
│   │   ├── CashPayment.java
│   │   └── QRPayment.java
│   ├── delivery/
│   │   └── DeliveryStrategy.java
│   └── concretedeliveries/
│       ├── CourierDelivery.java
│       ├── DroneDelivery.java
│       └── PickupDelivery.java
└── RestaurantApp.java
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

### Running the Application

1. **Compile the project**:
   ```bash
   javac RestaurantApp.java
   ```

2. **Run the application**:
   ```bash
   java RestaurantApp
   ```

## Usage Examples

### Main Menu Options

```
======== RESTAURANT SYSTEM ========
1. Create Burger Order
2. Create Combo Order
3. Pay for Order
4. Show All Orders
5. Delivery
6. Exit
```

### Example Workflow

1. **Create a Combo Order**:
    - Select option 2
    - Choose burger type (Beef, Chicken, Double Beef, Cheeseburger)
    - Add optional toppings (Cheese, Sauce, Jalapeno)
    - Select drink (Cola, Pepsi, Fanta, Sprite)
    - Select side (Fries, Wedges, Onion Rings)
    - System generates order ID and calculates total cost

2. **Pay for Order**:
    - Select option 3
    - Enter order ID
    - Choose payment method (Cash, Card, QR)
    - Order status updates to PAID

3. **Deliver Order**:
    - Select option 5
    - Enter order ID
    - Provide delivery address
    - Choose delivery method (Courier, Pickup, Drone)

## Pricing

### Burgers
- Chicken Burger: 1200 KZT
- Beef Burger: 1400 KZT
- Cheeseburger: 1500 KZT
- Double Beef Burger: 2400 KZT

### Toppings
- Extra Cheese: 300 KZT
- Extra Jalapeno: 300 KZT
- Extra Sauce: 200 KZT

### Sides
- Fries: 500 KZT
- Onion Rings: 500 KZT
- Wedges: 700 KZT

### Drinks
- Pepsi: 350 KZT
- Cola: 600 KZT
- Fanta: 600 KZT
- Sprite: 600 KZT

## Order Status Lifecycle

```
CREATED → COOKING → READY → PAID
```

1. **CREATED**: Order is placed
2. **COOKING**: Kitchen starts preparing
3. **READY**: Order is ready for pickup/delivery
4. **PAID**: Payment completed

##  Design Pattern Benefits

### Factory Pattern
 Encapsulates object creation logic  
 Easy to add new burger/side types  
 Reduces code duplication

### Builder Pattern
 Handles complex object construction  
 Supports optional parameters  
 Improves code readability

### Decorator Pattern
 Adds functionality dynamically  
 Avoids class explosion  
 Follows Open/Closed Principle

### Strategy Pattern
 Enables runtime algorithm selection  
 Easy to add new payment/delivery methods  
 Promotes code reusability

### Observer Pattern
 Loose coupling between components  
 Multiple listeners can react to events  
 Supports publish-subscribe model

### Facade Pattern
 Simplifies complex subsystem interactions  
 Provides unified interface  
 Reduces client dependencies

## Key Features

-  **Flexible Meal Creation**: Multiple burger types with customizable toppings
-  **Combo Builder**: Create complete meals with burger, side, and drink
-  **Multiple Payment Options**: Cash, Card, and QR payment methods
-  **Delivery Services**: Courier, Pickup, and Drone delivery options
-  **Real-time Notifications**: Kitchen and customer receive order updates
-  **Order Tracking**: View all orders with status and details
-  **Dynamic Pricing**: Automatic cost calculation including toppings

## Error Handling

The system includes comprehensive validation:
- Null checks for orders and strategies
- Validation for empty addresses
- Protection against invalid burger/topping types
- Listener null safety

## Notes

- Order IDs are auto-generated in format: `ORD-001`, `ORD-002`, etc.
- All prices are in KZT (Kazakhstani Tenge)
- The system uses a console-based interface for simplicity
- Observer pattern ensures both kitchen and customer are notified simultaneously

