public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double heightInMeters) {
        super(name, heightInMeters);
        super.setRequiredNutrient(NutrientValues.PROTEINDRINK);
    }
}
