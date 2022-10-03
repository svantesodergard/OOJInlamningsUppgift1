public class Cactus extends Plant {
    public Cactus(String name, double heightInMeters) {
        super(name, heightInMeters);
    }

    @Override
    public String calculateRequiredNutrients() {
        return "0,2 centiliter mineralvatten";
    }
}
