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
    //Tworzymy naszą ramkę widokową aplikacji
    JFrame jFrame = new JFrame();
    JButton buttonFindPerfectNumber = new JButton("Find Perfect Numbers");
    JTextField jTextField1 = new JTextField("type here");
    JTextField jTextField2 = new JTextField("type here");
    JLabel jLabelWelcome = new JLabel("Welcome in program to calculate Perfect Numbers for you! ", JLabel.CENTER);
    JLabel jLabelLowerValue = new JLabel("Please Type lower value of compartment: ", JLabel.CENTER);
    JLabel jLabelHigherValue = new JLabel("Please Type higher value of compartment: ", JLabel.CENTER);


    JTextArea jTextArea = new JTextArea();
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

    public void initComponents(){



        //Usawiamy jej pozycję oraz wymiary
        jFrame.setBounds(300,300,500,500);
        //Parametr widoczny na true
        jFrame.setVisible(true);
        //Ustawienie rozłącżenia tutaj na 6 kolumn i 1 rząd.
        jFrame.setLayout(new GridLayout(6,1));
        //Parametr reakcji na wciśnięcie krzyżyka w górnym prawym rogu na "zamknij"
        jFrame.setDefaultCloseOperation(3);
        //Nadanie tytułu u góry
        jFrame.setName("Perfect Numbers");
        //Wrzucamy każdy element w ramkę
        jFrame.add(jLabelWelcome);
        jFrame.add(jLabelLowerValue);
        jFrame.add(jTextField1);
        jFrame.add(jLabelHigherValue);
        jFrame.add(jTextField2);
        jFrame.add(buttonFindPerfectNumber);
        jFrame.getContentPane();

        //Funkcja potrzebna do odświeżania aplikacji jakby miała się przydać:
        SwingUtilities.updateComponentTreeUI(this);



    }
}