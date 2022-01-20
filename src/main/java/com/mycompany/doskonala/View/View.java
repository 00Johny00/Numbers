package com.mycompany.doskonala.View;

/**
 *
 * @author Mateusz Kowal
 * @version 1
 */

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
    Class of model*/
public class View  extends JFrame {

      /**
       Show dialog suggest to type lower compartment value*/
    public void showDialogLower(){

        System.out.println("Please Enter Lower Compartment");
    }
      /**
       Show dialog suggest to type higher compartment value*/
    public void showDialogHigher(){

        System.out.println("Please Enter Higher Compartment");
    }
      /**
       Show perfect numbers value*/
    public void showPerfectNumbers(List<Integer> perfectNumbers){
      System.out.println("Perfect Numbers are: ");
      perfectNumbers.stream().forEach(System.out::println);
    }
}