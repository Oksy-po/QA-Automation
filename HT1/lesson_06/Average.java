package lesson_06;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 0; i < 100; i++) {
            sum += i;
        }
            System.out.println("average = " + (sum/101));
        }
    }
