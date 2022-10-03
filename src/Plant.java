abstract class Plant implements RequiresNutrients {
    private String name;
    private double heightInMeters;

    public Plant() {}
    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }
    public String getName() {
        return this.name;
    }
}
