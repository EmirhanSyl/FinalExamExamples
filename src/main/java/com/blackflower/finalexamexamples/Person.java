package com.blackflower.finalexamexamples;

import java.util.ArrayList;

/**
 *
 * @author emirs
 */
public abstract class Person {
    
    String firstName;
    String lastName;
    
    ArrayList<String> addresses = new ArrayList<>();
    private int salary;
    int[] workingMonths;
    
    
    int GetPersonSalary(){
        return salary * workingMonths.length;
    }
}
