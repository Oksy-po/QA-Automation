package lesson_09;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class AreArraysEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int size = input.nextInt();
        int array1[] = new int[size];
        System.out.println("Insert array elements: ");
        for (int i = 0; i < size; i++) {
            array1[i]=input.nextInt();}
            System.out.println("Enter your second array length: ");
        int size2 = input.nextInt();
        int array2[] = new int[size2];
        System.out.println("Insert second array elements: ");
        for (int a = 0; a < size2; a++) {
            array2[a]=input.nextInt();
        }
        System.out.println("checkArraysEqual() = " + checkArraysEqual(array1,array2));
        System.out.println("checkArraysEqual2() = " + checkArraysEqual2(array1,array2));

    }
    public static boolean  checkArraysEqual(int [] myArray, int [] myArray2) {
        if (Arrays.equals(myArray,myArray2)) {
            return true;
        }
        return false;
    }
    public static boolean checkArraysEqual2 (int [] myArray, int [] myArray2){
        return IntStream.range(0,myArray.length).allMatch(i -> Objects.equals(myArray[i], myArray2[i]));
    }

}
