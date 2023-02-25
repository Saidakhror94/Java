package Homework;

import java.util.Scanner;

public class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int monthNumber = scanner.nextInt();
        String monthName;
        String season;
        switch (monthNumber){
            case 1:
                monthName = "Январь";
                season = "Зима";
                break;
            case 2:
                monthName = "Февраль";
                season = "Зима";
                break;
            case 3:
                monthName = "Март";
                season = "Весна";
                break;
            case 4:
                monthName = "Апрель";
                season = "Весна";
                break;
            case 5:
                monthName = "Май";
                season = "Весна";
                break;
            case 6:
                monthName = "Июнь";
                season = "Лето";
                break;
            case 7:
                monthName = "Июль";
                season = "Лето";
                break;
            case 8:
                monthName = "Август";
                season = "Лето";
                break;
            case 9:
                monthName = "Сентябрь";
                season = "Осень";
                break;
            case 10:
                monthName = "Октябрь";
                season = "Осень";
                break;
            case 11:
                monthName = "Ноябрь";
                season = "Осень";
                break;
            case 12:
                monthName = "Декабрь";
                season = "Зима";
                break;
            default:
                monthName= "Неизвестный месяц";
                        season = "Неизвестное время года";
                        break;
        }
        System.out.println("Месяц: " + monthName);
        System.out.println("Время года: " + season);
    }
}
