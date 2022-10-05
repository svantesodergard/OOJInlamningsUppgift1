import org.junit.jupiter.api.Test;

public class CarnivorousPlantTest {
    @Test
    void testCalculateRequiredNutrients() {
        CarnivorousPlant carnivorousPlant = new CarnivorousPlant("Meatloaf", 0.7);
        double proteinDrink = carnivorousPlant.calculateRequiredNutrients();

        assert (proteinDrink == 0.24);
    }
}
