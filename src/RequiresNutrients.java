public interface RequiresNutrients {
    //Här förekommer massa polymorfism
    double calculateRequiredNutrients();
    String requiredNutrientsString();
    void setRequiredNutrient(NutrientValues nutrientValues);
}