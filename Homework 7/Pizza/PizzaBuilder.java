package pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String chain;
    private String size;
    private List<String> toppings;

    public PizzaBuilder(String chain, String size) {
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public PizzaBuilder addPepperoni() {
        this.toppings.add("Pepperoni");
        return this;
    }

    public PizzaBuilder addSausage() {
        this.toppings.add("Sausage");
        return this;
    }

    public PizzaBuilder addMushrooms() {
        this.toppings.add("Mushrooms");
        return this;
    }

    public PizzaBuilder addBacon() {
        this.toppings.add("Bacon");
        return this;
    }

    public PizzaBuilder addOnions() {
        this.toppings.add("Onions");
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        this.toppings.add("Extra Cheese");
        return this;
    }

    public PizzaBuilder addPeppers() {
        this.toppings.add("Peppers");
        return this;
    }

    public PizzaBuilder addChicken() {
        this.toppings.add("Chicken");
        return this;
    }

    public PizzaBuilder addOlives() {
        this.toppings.add("Olives");
        return this;
    }

    public PizzaBuilder addSpinach() {
        this.toppings.add("Spinach");
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        this.toppings.add("Tomato and Basil");
        return this;
    }

    public PizzaBuilder addBeef() {
        this.toppings.add("Beef");
        return this;
    }

    public PizzaBuilder addHam() {
        this.toppings.add("Ham");
        return this;
    }

    public PizzaBuilder addPesto() {
        this.toppings.add("Pesto");
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        this.toppings.add("Spicy Pork");
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        this.toppings.add("Ham and Pineapple");
        return this;
    }



    public Pizza build() {
        return new Pizza(chain, size, toppings);
    }
}