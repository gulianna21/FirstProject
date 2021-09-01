package org.example.juli.first;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class SecondProject {
    // 1
    public static int[] massReplacementValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

    public static void replacementValues() {
        for (int i = 0; i < massReplacementValues.length; i++) {
            massReplacementValues[i] = massReplacementValues[i] == 0 ? 1 : 0;
        }
        printMass(massReplacementValues);
    }

    //2
    public static int[] massEveryThird = new int[8];

    public static void everyThird() {
        for (int i = 0; i < massEveryThird.length; i++) {
            massEveryThird[i] = i * 3;
        }
        printMass(massEveryThird);
    }

    //3
    public static int[] massIncreaseLess6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

    public static void increaseLess6() {
        for (int i = 0; i < massIncreaseLess6.length; i++) {
            if (massIncreaseLess6[i] < 6) {
                massIncreaseLess6[i] = massIncreaseLess6[i] * 2;
            }
        }
        printMass(massIncreaseLess6);
    }

    //4
    public static int[] massFindMinMax = {1, 2, 3, 4, 9, 4, 0, 17, 56, 11, -2};

    public static void minMax() {
        int min = massFindMinMax[0], max = massFindMinMax[0];
        for (int j : massFindMinMax) {
            if (min > j) {
                min = j;
            }
            if (max < j) {
                max = j;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    public static void fastMinMax() {
        Arrays.sort(massFindMinMax);
        System.out.println(massFindMinMax[0]);
        System.out.println(massFindMinMax[massFindMinMax.length - 1]);
    }

    //5
    public static int[] massCheckBalance = {1, 1, 1, 1, 4};

    public static boolean checkBalance() {
        int sum = 0;
        for (int i = 0; i < massCheckBalance.length; i++) {
            sum += massCheckBalance[i];
            int sum2 = 0;
            for (int j = i + 1; j < massCheckBalance.length; j++) {
                sum2 += massCheckBalance[j];
            }
            if (sum == sum2) {
                return true;
            }
        }
        return false;

    }

    //6
    public static int[] fastShiftMass(int[] mass, int position) {
        int truePosition = position > mass.length ? position / mass.length : position;
        if (truePosition > 0) {
            for (int i = 0; i < truePosition; i++) {
                int temp = mass[i];
                System.arraycopy(mass, 1, mass, 0, mass.length - 1);
                mass[mass.length - 1] = temp;
            }
        } else {
            for (int i = mass.length - 1; i > mass.length + truePosition - 1; i--) {
                int temp = mass[i];
                System.arraycopy(mass, 0, mass, 1, mass.length - 1);
                mass[0] = temp;
            }
        }
        return mass;
    }

    public static int[] shiftMass(int[] mass, int position) {
        int truePosition = position > mass.length ? position / mass.length : position;
        int[] mas = new int[mass.length];
        int count = 0;
        if (truePosition > 0) {
            for (int i = truePosition; i < mass.length; i++) {
                mas[count] = mass[i];
                count++;
            }
            for (int i = 0; i < truePosition; i++) {
                mas[count] = mass[i];
                count++;
            }
        } else {
            int findPosition = mass.length + truePosition;
            for (int i = findPosition; i < mass.length; i++) {
                mas[count] = mass[i];
                count++;
            }
            for (int i = 0; i < findPosition; i++) {
                mas[count] = mass[i];
                count++;
            }
        }
        return mas;
    }


    public static void printMass(int[] mass) {
        for (int value : mass) {
            System.out.println(value);
        }
    }
}
