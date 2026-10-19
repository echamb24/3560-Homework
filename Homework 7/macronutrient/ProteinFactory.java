package macronutrient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    public Protein createProtein(String dietPlan) {
        List<Protein> options = new ArrayList<>();

        //Vegan = only tofu
        if (dietPlan.equals("Vegan")) {
            options.add(new Tofu());
        } else {
            options.add(new Fish());
            options.add(new Chicken());
            options.add(new Beef());
            
            //Tofu only if not paleo
            if (!dietPlan.equals("Paleo")) {
                options.add(new Tofu());
            }
        }

        Random rand = new Random();
        return options.get(rand.nextInt(options.size()));
    }
}