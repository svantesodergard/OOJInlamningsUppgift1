import org.junit.jupiter.api.Test;

class PlantTest {
    Plant igge = new Cactus("Igge", 0.2);

    @Test
    void calculateRequiredNutrientsTest() {
        double requiredNutrientsExpected = 0.2;
        assert (igge.calculateRequiredNutrients() == 0.2);
        assert (igge.calculateRequiredNutrients() != 0.04);
    }
}