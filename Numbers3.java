package Homework;

import java.util.Random;

public class Numbers3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(900) + 100; // генерируем случайное трехзначное число

        int maxDigit = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            tempNumber /= 10;
        }

        System.out.println("Случайное число: " + number);
        System.out.println("Наибольшая цифра: " + maxDigit);
    }
}
