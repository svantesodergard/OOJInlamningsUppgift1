public class PalmTree extends Plant {

    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
        super.setRequiredNutrient(NutrientValues.TAPWATER);
    }
}
