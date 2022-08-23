package cad.trainingsws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AthletTest {

    @Test
    @DisplayName("Should return an athlet with a name")
    void randomEasyShouldReturnAnAthletWithAName() {
        Athlet athlet = Athlet.randomEasy();
        assertNotNull(athlet.name);
    }

    @Test
    @DisplayName("Should return true when the weight is less than maxweight")
    void matchWeightClassWhenWeightIsLessThanMaxWeightThenReturnTrue() {
        Athlet athlet = new Athlet("Justin");
        athlet.weight = 50;
        assertTrue(athlet.matchWeightClass(0, 100, 100));
    }

    @Test
    @DisplayName("Should return false when the weight is more than maxweight")
    void matchWeightClassWhenWeightIsMoreThanMaxWeightThenReturnFalse() {
        Athlet athlet = new Athlet("Justin");
        athlet.weight = 100;
        assertFalse(athlet.matchWeightClass(0, 100, 99));
    }
}