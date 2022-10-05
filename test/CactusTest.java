import org.junit.jupiter.api.Test;

class CactusTest {
    @Test
    void testCalculateRequiredNutrients() {
        Cactus cactus = new Cactus("Igge", 0.2);
        double water = cactus.calculateRequiredNutrients();

        assert (water == 0.2);
        assert (water != 0.1);
        assert (water != 0.12);
    }
}