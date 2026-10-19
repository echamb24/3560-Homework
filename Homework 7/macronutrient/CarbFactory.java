package macronutrient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbFactory {
    private static CarbFactory instance;

    private CarbFactory() {}

    public static CarbFactory getInstance() {
        if (instance == null) {
            instance = new CarbFactory();
        }
        return instance;
    }

    public Carb createCarb(String dietPlan) {
        List<Carb> options = new ArrayList<>();
        
        //Paleo = only pistachio
        if (dietPlan.equals("Paleo")) {
            options.add(new Pistachio());
        } else {
            options.add(new Bread());
            options.add(new Lentils());
            
            //Cheese only if not vegan
            if (!dietPlan.equals("Vegan")) {
                options.add(new Cheese());
            }
            //Pistachio only if no nut allergy
            if (!dietPlan.equals("Nut Allergy")) {
                options.add(new Pistachio());
            }
        }

        Random rand = new Random();
        return options.get(rand.nextInt(options.size()));
    }
}