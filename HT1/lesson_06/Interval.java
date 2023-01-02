package lesson_06;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 100: ");
        int number = input.nextInt();
        for (int i = 0; i < 100; i++) {
            if (number >= 0 && number <=14){
            System.out.println("[0 – 14] ");
            break;}
            else if (number >= 15 && number <=35){
                System.out.println("[15 – 35] ");
            break;}
            else if (number >= 36 && number <50){
                System.out.println("[36 – 50] ");
            break;}
            else if (number >= 50 && number <=100){
                System.out.println("[50 – 100] ");
            break;}
            else if (number < 0 || number > 100){
                System.out.println("Wrong number ");
                break;
            }
        }
    }
}
