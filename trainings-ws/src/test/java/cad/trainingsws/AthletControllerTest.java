package cad.trainingsws;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@AutoConfigureMockMvc
class AthletControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private AthletController athletController;

    @Test
    @DisplayName("Should return an athlet object")
    void athletShouldReturnAnAthletObject() {
        Athlet athlet = athletController.athlet();
        assertNotNull(athlet);
    }
}