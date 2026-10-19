package macronutrient;

public class MacronutrientFactory {
    private static MacronutrientFactory instance;

    private MacronutrientFactory() {}

    public static MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }

    public Meal createMeal(String dietPlan) {
        Carb carb = CarbFactory.getInstance().createCarb(dietPlan);
        Protein protein = ProteinFactory.getInstance().createProtein(dietPlan);
        Fat fat = FatFactory.getInstance().createFat(dietPlan);

        return new Meal(carb, protein, fat);
    }
}