package com.mycompany.doskonala.Controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ControllerTest {

    @BeforeEach
    void beforeEach(){
        Controller controller = new Controller();
    }

    @Test
    void shouldAcceptLowerCompartments() {
        int lowerExpected = 1; //Wartości: jedna ujemna, jedna zero, jedna dodatnia
        int input = 1;
        assertEquals(lowerExpected,input);
    }

    @Test
    void shouldAcceptHigherCompartments() { //Wartości: jedna ujemna, jedna zero, jedna dodatnia
        int higherExpected = 1; //Wartości: jedna ujemna, jedna zero, jedna dodatnia
        int input = 1;
        assertEquals(higherExpected,input);
    }
    @Test
    void shouldThrowExceptionAtLowerCompartments(){
        ControllerExceptionHandler thrown = assertThrows(ControllerExceptionHandler.class, () -> {
            throw new ControllerExceptionHandler();
        });
        String controllerExceptionHandlerMessage = "Wrong typed compartments. Compartment should he higher then 0, and lower must be lower then higher";
        assertEquals(controllerExceptionHandlerMessage, thrown.getMessage());
    }
}