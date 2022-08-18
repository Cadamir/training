package cad.trainingsws;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.spring.web.plugins.Docket;

@RestController
public class AthletController {
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/athlet")
    public Athlet athlet(){
        return Athlet.randomFull();
    }

    @GetMapping("/error")
    public String swagger(){
        return new SpringFoxConfig().api().toString();
    }

}
