package src.lesson_03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        double result;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        firstNumber = input.nextDouble();
        System.out.println("Enter second number: ");
        secondNumber = input.nextDouble();

        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println(firstNumber + " + "+ secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " - "+ secondNumber + " = " + (firstNumber - secondNumber));
        System.out.println(firstNumber + " * "+ secondNumber + " = " + (firstNumber * secondNumber));
        System.out.println(firstNumber + " / "+ secondNumber + " = " + (firstNumber / secondNumber));

    }
}
