public class CarnivorousPlant extends Plant {
    private final String nutrientType = NutrientType.PROTEINDRINK.nutrientType;
    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public String calculateRequiredNutrients() {
        double requiredProteinDrink = 0.1 +  (0.2*this.getHeightInMeters());
        return requiredProteinDrink + " liter " + this.nutrientType;
    }
}
