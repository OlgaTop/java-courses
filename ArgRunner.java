package com.shpp.demo;

import java.util.Scanner;

// client class: data is taken from the program start parameters

public final class ArgRunner {

    public static void main( final String[] arg){
        String[] numbers = {"10", "5"};
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Select an action : +, -, *, /, ^ "); //selection of the type of arithmetic action
                String act = reader.next();
                calc.add(act.charAt(0), Integer.valueOf("10"), Integer.valueOf("5"));
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



