package macronutrient;

public class Meal {
    private Carb carb;
    private Protein protein;
    private Fat fat;

    public Meal(Carb carb, Protein protein, Fat fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    public void printMeal() {
        System.out.println("- Carb: " + carb.getName());
        System.out.println("- Protein: " + protein.getName());
        System.out.println("- Fat: " + fat.getName());
        System.out.println("--------------------------------------------------");
    }
}