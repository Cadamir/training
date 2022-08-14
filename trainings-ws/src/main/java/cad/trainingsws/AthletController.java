package cad.trainingsws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AthletController {
    @GetMapping("/athlet")
    public Athlet athlet(){
        return Athlet.randomFull();
    }

}
