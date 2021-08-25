/**
 * Created by Julia on 23.08.2021.
 */
package org.example.juli.first;

import java.util.Scanner;

public class MainApp {
    // 1
    public static void main(String[] args) {

        // 2
        byte variableByte = 127;
        short variableShort = 2;
        int variableInt = 20;
        long variableLong = 2147483649L;
        float variableFloat = 2.25f;
        double variableDouble = 3.14159;
        char variableChar = 'a';
        boolean variableBoolean = true;
        String variableString = "Hello";

        //3
        System.out.println(getResult(20, 3, 4, 3));

        //4
        System.out.println(checkSum(25, 3));

        //5
        checkSignNumber(-30);
        checkSignNumber(15);
        checkSignNumber(0);

        //6
        System.out.println(isNegative(-30));
        System.out.println(isNegative(15));
        System.out.println(isNegative(0));

        //7
        printHello("Yulia");

        //8
        checkYear();
    }

    public static int getResult(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    public static boolean checkSum(int first, int second) {
        final int sum = first + second;
        return sum > 9 && sum < 21;
    }

    public static void checkSignNumber(int num) {
        if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    public static boolean isNegative(int num) {
        return num < 0;
    }

    public static void printHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // определение високосного года
    public static void checkYear() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = 0;
        if (enter.hasNextInt()) {
            year = enter.nextInt();
        } else {
            System.out.println("Sorry, but this is not a number. Try again!");
        }
        if (((year % 400) == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
