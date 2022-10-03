public enum NutrientType {
    TAPWATER ("kranvatten"),
    PROTEINDRINK ("proteindryck"),
    MINERALWATER ("mineralvatten");

    final public String nutrientType;

    NutrientType(String nutrientType) {
        this.nutrientType = nutrientType;
    }
}