package com.company;
import java.util.Scanner;
public class newInternet {

    public static void main(String[] args) {
        System.out.println("hello world");
        //comment
        int apples;//will be initialized when prompted
        int oranges;//will be initialized when prompted
        int total;
        Scanner scnr = new Scanner(System.in);

        //get number of apples
        System.out.println("Enter number of apples: ");
        apples = scnr.nextInt();

        //get number of oranges
        System.out.println("Enter number of oranges: ");
        oranges = scnr.nextInt();

        //calculate total fruit
        total = apples + oranges;

        //print total
        System.out.println("Total peices of fruit:" + total);


    }
}
