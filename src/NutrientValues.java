public enum NutrientValues {
    TAPWATER ("kranvatten", 0, 0.5, "liter"),
    PROTEINDRINK ("proteindryck", 0.1, 0.2, "liter"),
    MINERALWATER ("mineralvatten", 0.2, 0, "cl");

    final public String nutrientType;
    final public double baseVolume;
    final public double volumeVariableByHeight;
    final public String volumeUnit;

    NutrientValues(String nutrientType, double baseVolume, double volumeVariableByHeight, String volumeUnit) {
        this.nutrientType = nutrientType;
        this.baseVolume = baseVolume;
        this.volumeVariableByHeight = volumeVariableByHeight;
        this.volumeUnit = volumeUnit;
    }
}