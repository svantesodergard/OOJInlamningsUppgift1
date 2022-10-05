import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTreeTest {
    @Test
    void testCalculateRequiredNutrients() {
        PalmTree palmTree = new PalmTree("Laura", 5);
        double water = palmTree.calculateRequiredNutrients();

        assert (water == 2.5);
        assert (water != 0.2);
        assert (water != 1.1);
    }
}