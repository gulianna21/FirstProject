package org.example.juli.first;

import java.util.Random;
import java.util.Scanner;

public class ThirdProject {

    //1
    public static void mass() {
        System.out.println("Введите размер квадратного массива:");
        Scanner scanner = new Scanner(System.in);
        int massSize = scanner.nextInt();
        int[][] test = new int[massSize][massSize];
        int pos = test[0].length - 1;
        for (int i = 0; i < test[0].length; i++) {
            for (int j = 0; j < test[1].length; j++) {
                if (pos == j) {
                    test[i][j] = 1;
                    pos--;
                } else {
                    test[i][j] = i == j ? 1 : 0;
                }
                System.out.print(test[i][j]);
            }
            System.out.println();
        }
    }

    //2
    public static void guessNumberGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number = random.nextInt(10);
        int count = 3;
        do {
            if (count == 3) {
                System.out.println("Напишите ваше число!");
            }
            int numberUser = scanner.nextInt();
            if (numberUser == number) {
                System.out.println("Угадали!");
                break;
            } else {
                System.out.println(numberUser > number ? "Ваше число больше" : "Ваше число меньше");
            }
            count--;
            if (count == 0) {
                System.out.println("Неудача");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
                int check = scanner.nextInt();
                count = check == 1 ? 3 : 0;
            }
        } while (count != 0);
    }

    //3
    public static void guessStringGame() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String sample = "###############";
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};
        String word = words[random.nextInt(words.length)];
        char[] wordChar = word.toCharArray();
        char[] sampleChar = sample.toCharArray();
        do {
            System.out.println("Введите слово");
            String stringUser = scanner.nextLine().toLowerCase();
            if (word.equals(stringUser)) {
                System.out.println("Победа! Вы угадали!!!");
                break;
            }
            char[] stringUserChar = stringUser.toCharArray();
            for (int i = 0; i < wordChar.length; i++) {
                if (stringUserChar.length > i) {
                    sampleChar[i] = stringUserChar[i] == wordChar[i] ? stringUserChar[i] : '#';
                }
            }
            String string = new String(sampleChar);
            System.out.println("Шаблон: " + string);
        } while (true);
    }
}
