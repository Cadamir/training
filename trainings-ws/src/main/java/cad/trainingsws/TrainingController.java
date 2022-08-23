package cad.trainingsws;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainingController {

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/training")
    public Training[] getRandom(@RequestParam(value = "number", defaultValue = "10") int number){
        Training[] trainings = new Training[number];
        for(int i = 0; i < number; i++){
            trainings[i] = Training.random();
        }

        return trainings;
    }
}
