/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doskonala.Controller;

import com.mycompany.doskonala.Model.Model;
import com.mycompany.doskonala.View.View;
import java.util.Scanner;

/**
 *
 * @author Mateusz Kowal
 * @version 1
 */
/**
 Controller class*/
public class Controller {
    /**
     Scanner*/
     private Scanner sc;
         /**
     View-Controller*/
     private View view;

    /**
     Scanner*/

    public Controller() {

    }
   /**
    Method taking lower compartment
    * @return return lower compartment value
    */
    public int takeLowerCompartments() throws ControllerExceptionHandler {
        int lower;
        sc = new Scanner(System.in);
        lower = sc.nextInt();
        if(lower > 0) return lower;
        else throw new ControllerExceptionHandler();
    }
      /**
    Method taking higher compartment
       * @return return higher compartment value
       */
    public int takeHigherCompartments() throws ControllerExceptionHandler{
        int higher;
        sc = new Scanner(System.in);
        higher = sc.nextInt();
        if(higher > 0) return higher;
        else throw new ControllerExceptionHandler();
    }

    /**
     Main method
     Ask user to put value of lower compartment and higher compartment.Then based on this scope looks for perfect number.
     Show our perfect number from typed scope.
     @param args
     * @throws com.mycompany.doskonala.Controller.ControllerExceptionHandler*/

    public static void main(String args[]) throws ControllerExceptionHandler {

        Model theModel = new Model();
        View theView = new View();
        Controller theController = new Controller();
        theView.initComponents();

        theView.showDialogLower();
        theModel.setLower(theController.takeLowerCompartments());

        theView.showDialogHigher();
        theModel.setHigher( theController.takeHigherCompartments());

        theView.showPerfectNumbers(theModel.findPerfectNumberBetweenLowerAndHigher(theModel.getLower(),theModel.getHigher()));
    }
    
}