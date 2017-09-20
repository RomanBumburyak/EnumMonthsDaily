package com.example;
import com.example.common.Month;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose one of the months");    /// using scanner to find on the months.

        for (Month month : Month.values()) {
            System.out.println(month.getEnglishName());

        }
        String userInput = scanner.nextLine();



        ArrayList<String> months = new ArrayList<>();




    }
}
