package com.mycompany.doskonala.View;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViewTest {
    /**
     *
     * @author Mateusz Kowal
     * @version 1
     */
    /**
     Class of ViewTest */
    private static final String MESSAGE_FOR_ENTER_LOWER_COMPARTMENT = "Please Enter Lower Compartment";
    private static final String MESSAGE_FOR_ENTER_HIGHER_COMPARTMENT = "Please Enter Higher Compartment";
    private static final String MESSAGE_FOR_RESULTS = "Perfect Numbers are: \n";

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private View view;

    @BeforeEach
    void beforeEach(){
        view = new View();
        System.setOut(new PrintStream(outputStreamCaptor));

    }
    /**
     Test showDialogLowers */
    public
    @Test
    void showDialogLower() {

        view.showDialogLower();
        assertEquals(outputStreamCaptor.toString().trim(), MESSAGE_FOR_ENTER_LOWER_COMPARTMENT);
    }
    /**
     Test showDialogHigher */
    @Test
    void showDialogHigher() {
        view.showDialogHigher();
        assertEquals(outputStreamCaptor.toString().trim(), MESSAGE_FOR_ENTER_HIGHER_COMPARTMENT);
    }
    /**
     Test showPerfectNumbers on terminal*/
    @Test
    void showPerfectNumbers() {
        List perfectNumbers = new ArrayList();
        perfectNumbers.add(0, 6);
        perfectNumbers.add(1, 28);
        perfectNumbers.add(2, 496);
        view.showPerfectNumbers(perfectNumbers);
        assertEquals(outputStreamCaptor.toString().trim(),MESSAGE_FOR_RESULTS +
                "6\n" +
                "28\n" +
                "496");
    }
}