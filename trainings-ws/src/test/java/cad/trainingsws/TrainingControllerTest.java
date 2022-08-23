package cad.trainingsws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TrainingControllerTest {

    @Autowired
    private TrainingController trainingController;

    @Test
    @DisplayName("Should return an array of trainings with the given number")
    void getRandomWhenNumberIsGivenThenReturnArrayOfTrainingsWithTheGivenNumber() {
        int number = 10;
        Training[] trainings = trainingController.getRandom(number);
        assertEquals(number, trainings.length);
    }

    @Test
    @DisplayName("Should return an array of 10 trainings when the number is not given")
    void getRandomWhenNumberIsNotGivenThenReturnArrayOf10Trainings() {
        Training[] trainings = trainingController.getRandom(10);
        assertEquals(10, trainings.length);
    }
}