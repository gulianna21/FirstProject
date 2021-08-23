/**
 * Created by Julia on 23.08.2021.
 */
package org.example.juli.first;

public class MainApp {
    public static void main(String[] args) {
        byte variableByte = 127;
        short variableShort = 2;
        int variableInt = 20;
        long variableLong = 2147483649L;
        float variableFloat = 2.25f;
        double variableDouble = 3.14159;
        char variableChar = 'a';
        boolean variableBoolean = true;
        String variableString = "Hello";

        System.out.println(getResult(20, 3, 4,3));
        System.out.println(checkSum(25, 3));
    }

    public static int getResult(int a, int b, int c, int d){
        return a * (b + (c / d));
    }

    public static boolean checkSum(int first, int second){
        final int difference = first - second;
        return difference>9 && difference<21;
    }
}
