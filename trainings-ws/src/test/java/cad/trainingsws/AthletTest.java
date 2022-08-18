package cad.trainingsws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class AthletTest {

    @Test
    @DisplayName("Should return an athlet with a name")
    void randomFullShouldReturnAnAthletWithAName() {
        Athlet athlet = Athlet.randomFull();
        assertNotNull(athlet.name);
    }

    @Test
    @DisplayName("Should return an athlet with clubs")
    void randomFullShouldReturnAnAthletWithClubs() {
        Athlet athlet = Athlet.randomFull();
        assertNotNull(athlet.clubs);
    }

    @Test
    @DisplayName("Should return an athlet with a name")
    void randomEasyShouldReturnAnAthletWithAName() {
        Athlet athlet = Athlet.randomEasy();
        assertNotNull(athlet.name);
    }
}