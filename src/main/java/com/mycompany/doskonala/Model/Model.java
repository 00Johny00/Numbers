package com.mycompany.doskonala.Model;

import com.mycompany.doskonala.Controller.ControllerExceptionHandler;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Mateusz Kowal
 * @version 1
 */
  /**
    Class of model*/
public class Model {
      /**
    Higher and lover values*/
private int higher, lower;

   public Model() {

    }
      /**
    Checking every number from scope is perfect.And create table with perfect numbers.
    @param lower value of lower compartment
    @param higher value of higher compartment
    @return table of perfect Number Between Lower And Higher compartment
     * @throws com.mycompany.doskonala.Controller.ControllerExceptionHandler **/
    public  List<Integer> findPerfectNumberBetweenLowerAndHigher(int lower, int higher) throws ControllerExceptionHandler {
        List<Integer> perfectNumberList = new ArrayList<>();
        if(lower < 1 || higher < 1 || lower > higher) throw new ControllerExceptionHandler();
        for(int i = lower; i <= higher; i++){
            if (isPerfect(i)) {
                perfectNumberList.add(i);
            }
        }
        return perfectNumberList;
    }

    /**
     Method checking is number is perfect
     * @param number our gain number to check.
     * @return true if number is perfect number.
     */
    public boolean isPerfect(int number){
        int sum = 0;
        int prod = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
                prod *= i;
            }
        }
        if (sum == number)
            return true;
        return false;
    }
    /**
     Getters and Setters for higher compartment*/
    public int getHigher() {
        return higher;
    }

    public void setHigher(int higher) {
        this.higher = higher;
    }
    /**
     Getters and Setters for lower compartment*/
    public int getLower() {
        return lower;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }
}
