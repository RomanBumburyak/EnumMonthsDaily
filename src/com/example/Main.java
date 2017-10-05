package com.example;
import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose one of the months" );    /// using scanner to find on the months.

        for (Month month : Month.values()) {
            System.out.println(month.getEnglishName());

        }
        String userInput = scanner.nextLine();

//        In an ArrayList add all the months for the given month and all the following months. This can be done many ways but an elegant solution can be coded using a switch statement.
//
//                Show the list to the user.

        //(https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
        ArrayList<String> months = new ArrayList<>();


        switch (userInput){
            case "January": months.add("January");
            case "February": months.add("February");
            case "March": months.add("March");
            case "April": months.add("April");
            case "May": months.add("May");
            case "June": months.add("June");
            case "July": months.add("July");
            case "August": months.add("August");
            case "September": months.add("September");
            case "October": months.add("October");
            case "November": months.add("November");
            case "December": months.add("December");

            default: break;
        }
        System.out.println(months);




    }
}
