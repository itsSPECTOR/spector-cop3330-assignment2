package org.example.ex39;
import java.util.*;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 39 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App {

    public static void main(String[] args) {

        //create list of maps
        List employeeList = new ArrayList<>();

            //adding employees to list
            Map<String, Object> emp1 = new HashMap<String, Object>();
            emp1.put("fname", "John");
            emp1.put("lname", "Johnson");
            emp1.put("position", "Manager");
            emp1.put("sepdate", "2016-12-31");
            employeeList.add(emp1);

            Map<String, Object> emp2 = new HashMap<String, Object>();
            emp2.put("fname", "Tou");
            emp2.put("lname", "Xiong");
            emp2.put("position", "Software Engineer");
            emp2.put("sepdate", "2016-10-05");
            employeeList.add(emp2);

            Map<String, Object> emp3 = new HashMap<String, Object>();
            emp3.put("fname", "Michaela");
            emp3.put("lname", "Michaelson");
            emp3.put("position", "District Manager");
            emp3.put("sepdate", "2015-12-19");
            employeeList.add(emp3);

            Map<String, Object> emp4 = new HashMap<String, Object>();
            emp4.put("fname", "Jake");
            emp4.put("lname", "Jacobson");
            emp4.put("position", "Programmer");
            emp4.put("sepdate", "10-2018");
            employeeList.add(emp4);

            Map<String, Object> emp5 = new HashMap<String, Object>();
            emp5.put("fname", "Jacquelyn");
            emp5.put("lname", "Jackson");
            emp5.put("position", "DBA");
            emp5.put("sepdate", "10-2018");
            employeeList.add(emp5);

            Map<String, Object> emp6 = new HashMap<String, Object>();
            emp6.put("fname", "Sally");
            emp6.put("lname", "Webber");
            emp6.put("position", "Web Developer");
            emp6.put("sepdate", "2015-12-18");
            employeeList.add(emp6);

            System.out.print(emp1.get("lname"));

    }
}
