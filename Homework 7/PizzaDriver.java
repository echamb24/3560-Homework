import pizza.Pizza;
import pizza.PizzaBuilder;

public class PizzaDriver {
    public static void main(String[] args) {

        System.out.println("------------- Step 1 orders ------------");

        Pizza hutSmall = new PizzaBuilder("Pizza Hut", "Small")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .build();
        hutSmall.eat();

        Pizza hutMedium = new PizzaBuilder("Pizza Hut", "Medium")
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addChicken()
                .addOlives()
                .build();
        hutMedium.eat();

        Pizza hutLarge = new PizzaBuilder("Pizza Hut", "Large")
                .addSpinach()
                .addTomatoAndBasil()
                .addBeef()
                .addHam()
                .addPesto()
                .addSpicyPork()
                .addHamAndPineapple()
                .addPepperoni()
                .addExtraCheese()
                .build();
        hutLarge.eat();

        
        System.out.println("\n------------- Step 2 orders ------------");

        Pizza hutLarge2 = new PizzaBuilder("Pizza Hut", "Large")
                .addPepperoni()
                .addBacon()
                .addExtraCheese()
                .build();
        hutLarge2.eat();

        Pizza hutSmall2 = new PizzaBuilder("Pizza Hut", "Small")
                .addMushrooms()
                .addOnions()
                .build();
        hutSmall2.eat();

        Pizza caesarsMedium = new PizzaBuilder("Little Caesars", "Medium")
                .addPepperoni()
                .addSausage()
                .addMushrooms()
                .addBacon()
                .addOnions()
                .addExtraCheese()
                .addPeppers()
                .addOlives()
                .build();
        caesarsMedium.eat();

        Pizza caesarsSmall = new PizzaBuilder("Little Caesars", "Small")
                .addChicken()
                .addSpinach()
                .addTomatoAndBasil()
                .addBeef()
                .addHam()
                .addPesto()
                .build();
        caesarsSmall.eat();

        Pizza dominosSmall = new PizzaBuilder("Dominos", "Small")
                .addSpicyPork()
                .build();
        dominosSmall.eat();

        Pizza dominosLarge = new PizzaBuilder("Dominos", "Large")
                .addHamAndPineapple()
                .addExtraCheese()
                .addBacon()
                .build();
        dominosLarge.eat();
    }
}