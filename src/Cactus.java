public class Cactus extends Plant {
    private final String nutrientType = NutrientType.MINERALWATER.nutrientType;
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public String calculateRequiredNutrients() {
        return "0,2 centiliter " + this.nutrientType;
    }
}
