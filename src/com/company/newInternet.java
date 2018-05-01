package com.company;
import java.util.Scanner;
public class newInternet {

    public static void main(String[] args) {
        System.out.println("hello world");
        //comment
        int apples = 5;
        int oranges = 6;
        int total;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter number of apples: ");
        apples = scnr.nextInt();

        System.out.println("Enter number of oranges: ");
        oranges = scnr.nextInt();


        total = apples + oranges;

        System.out.println(total);
        System.out.println("HELLO FROM DESKTOP");

    }
}
