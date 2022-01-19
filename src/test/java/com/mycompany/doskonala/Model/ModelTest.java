package com.mycompany.doskonala.Model;

import com.mycompany.doskonala.Controller.Controller;
import com.mycompany.doskonala.Controller.ControllerExceptionHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    private Model model;

    @BeforeEach
    void beforeEach(){
        model = new Model();
    }
    @Test
    void findCorrectPerfectNumberBetweenLowerAndHigher() throws ControllerExceptionHandler {
        int lower = 1;
        int higher = 30;
        List results;
        List expectedResults = new ArrayList();
        expectedResults.add(0,6);
        expectedResults.add(1, 28);
        results = model.findPerfectNumberBetweenLowerAndHigher(lower,higher);
        assertEquals(expectedResults, results);
    }
    @Test
    void findWrongPerfectNumberBetweenLowerAndHigher() throws ControllerExceptionHandler {
        int lower = 1;
        int higher = 30;
        List results;
        List expectedResults = new ArrayList();
        expectedResults.add(0,6);
        expectedResults.add(1, 28);
        results = model.findPerfectNumberBetweenLowerAndHigher(lower,higher);
        assertEquals(expectedResults, results);
    }
    @Test
    void isPerfect() {
//        Assertions.assertEquals();
    }
}