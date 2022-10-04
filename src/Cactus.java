public class Cactus extends Plant {
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
        super.setRequiredNutrient(NutrientValues.MINERALWATER);
    }
}
