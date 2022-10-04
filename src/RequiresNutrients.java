public interface RequiresNutrients {
    double calculateRequiredNutrients();
    String requiredNutrientsString();
    void setRequiredNutrient(NutrientValues nutrientValues);
}