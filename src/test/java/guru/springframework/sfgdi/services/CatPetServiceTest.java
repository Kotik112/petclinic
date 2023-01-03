package guru.springframework.sfgdi.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatPetServiceTest {

    CatPetService catPetService;

    @BeforeEach
    void setUp() {
        catPetService = new CatPetService();
    }

    @Test
    void getPetType() {
        catPetService.getPetType();
    }
}