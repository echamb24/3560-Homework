package pizza;

import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<String> toppings;

    Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);

        if (toppings.isEmpty()) {
            System.out.println("Toppings: None");
        } else {
            System.out.println("Toppings: " + String.join(", ", toppings));
        }
        System.out.println("--------------------------------------------------");
    }
}