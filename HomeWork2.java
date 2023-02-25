package Homework;

import java.util.Random;

public class HomeWork2 {
  public static int getRandomStudent(int numStudents){
      Random rand = new Random();
      return rand.nextInt(numStudents - 1 )+2;

    }

    public static void main(String[] args) {
        int numStudents = 18;
        int randomStudents = getRandomStudent(numStudents);
        System.out.println("Случайный номер студента"+randomStudents);
    }
}

