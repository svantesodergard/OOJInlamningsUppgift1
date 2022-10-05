abstract class Plant implements RequiresNutrients {
    //Inkapsling
    private String name;
    private double heightInMeters;
    private NutrientValues requiredNutrient;

    public Plant() {}
    public Plant(String name, double heightInMeters) {
        this.name = name;
        this.heightInMeters = heightInMeters;
    }

    //Inkapsling
    public void setRequiredNutrient(NutrientValues requiredNutrient) {
        this.requiredNutrient = requiredNutrient;
    }

    @Override
    public double calculateRequiredNutrients() {
       return requiredNutrient.baseVolume + requiredNutrient.volumeVariableByHeight * this.heightInMeters;
    }
    @Override
    public String requiredNutrientsString() {
       return "Växten " + this.name + " behöver " + calculateRequiredNutrients() + " " +
               requiredNutrient.volumeUnit + " " + requiredNutrient.nutrientType;
    }
    public String getName() {
        return this.name;
    }
}
