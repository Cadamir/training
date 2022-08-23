package cad.trainingsws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    @Test
    @DisplayName("Should return a training with a random sport")
    void randomShouldReturnTrainingWithRandomSport() {
        Training training = Training.random();
        assertNotNull(training.sport);
    }

    @Test
    @DisplayName("Should return a training with a random club")
    void randomShouldReturnTrainingWithRandomClub() {
        Training training = Training.random();
        assertNotNull(training.club);
    }

    @Test
    @DisplayName("Should add the athlet to the athlets list")
    void addAthletShouldAddTheAthletToTheAthletsList() {
        Training training =
                new Training("Taekwondo", "Nickelhütte", "01.01.2022", "18:00", "19:00", "-");
        Athlet athlet = Athlet.randomEasy();
        training.addAthlet(athlet, 0);
        assertEquals(athlet, training.getAthlet(0));
    }

    @Test
    @DisplayName("Should throw an exception when the id is already taken")
    void addAthletShouldThrowAnExceptionWhenTheIdIsAlreadyTaken() {
        Training training = Training.random();
        Athlet athlet = Athlet.randomEasy();
        training.addAthlet(athlet, 0);
        assertThrows(IndexOutOfBoundsException.class, () -> training.addAthlet(athlet, 0));
    }

    @Test
    @DisplayName("Should return the athlet when the id is valid")
    void getAthletWhenIdIsValid() {
        Training training = Training.random();
        Athlet athlet = Athlet.randomEasy();
        training.addAthlet(athlet, 0);
        assertEquals(athlet, training.getAthlet(0));
    }

    @Test
    @DisplayName("Should throw an exception when the id is invalid")
    void getAthletWhenIdIsInvalidThenThrowException() {
        Training training = Training.random();
        assertThrows(
                IndexOutOfBoundsException.class, () -> training.getAthlet(training.athlets.size()));
    }
}