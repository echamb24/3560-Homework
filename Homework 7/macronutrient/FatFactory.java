package macronutrient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatFactory {
    private static FatFactory instance;

    private FatFactory() {}

    public static FatFactory getInstance() {
        if (instance == null) {
            instance = new FatFactory();
        }
        return instance;
    }

    public Fat createFat(String dietPlan) {
        List<Fat> options = new ArrayList<>();
        options.add(new Avocado());

        //Sour cream & tuna only if not vegan
        if (!dietPlan.equals("Vegan")) {
            //Sour cream only if not paleo
            if (!dietPlan.equals("Paleo")) {
                options.add(new SourCream());
            }
            options.add(new Tuna()); 
        }
        
        //Peanuts only if no nut allergy
        if (!dietPlan.equals("Nut Allergy")) {
            options.add(new Peanuts());
        }

        Random rand = new Random();
        return options.get(rand.nextInt(options.size()));
    }
}