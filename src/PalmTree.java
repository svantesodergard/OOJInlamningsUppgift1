public class PalmTree extends Plant {

    private final String nutrientType = NutrientType.TAPWATER.nutrientType;
    public PalmTree(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public String calculateRequiredNutrients() {
        double requiredTapWater = this.getHeightInMeters() * 0.5;
        return requiredTapWater + " liter " + this.nutrientType;
    }
}
