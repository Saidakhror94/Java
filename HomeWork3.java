package Homework;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        int digit1 = number / 100; // первая цифра
        int digit2 = (number / 10) % 10; // вторая цифра
        int digit3 = number % 10; // третья цифра

        int sum = digit1 + digit2 + digit3; // сумма цифр
        System.out.println("Сумма цифр числа " + number + " равна " + sum);
    }
}
