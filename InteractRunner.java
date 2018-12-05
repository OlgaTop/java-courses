package com.shpp.demo;

import java.util.Scanner;

// client class: user input

public final class InteractRunner {

    public static void main( final String[] arg){
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg : ");
                String first = reader.next();
                System.out.println("Enter second arg : ");
                String second = reader.next();
                System.out.println("Select an action : +, -, *, /, ^ "); //selection of the type of arithmetic action
                String act = reader.next();
                calc.add(act.charAt(0), Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult());
                calc.clearnResult();
                System.out.println("Exit: yes/no ");
                exit = reader.next();
            }

        } finally {
            reader.close();
        }
        }
    }


