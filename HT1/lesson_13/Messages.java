package lesson_13;

import java.util.*;

public class Messages {
    public static void printMainMenu(){
                System.out.println(" \nPlease choose from the next Menu: ");
                System.out.println(" 1.Add new shape");
                System.out.println(" 2.List all shapes");
                System.out.println(" 3.Sum all circumferences");
                System.out.println(" 4.Sum all areas");
                System.out.println(" 5.Find the biggest circumference");
                System.out.println(" 6.Find the biggest area");
                System.out.println(" 7.Exit");
                Scanner input = new Scanner(System.in);
                int option = input.nextInt();
                while (option < 0 || option > 7){
                    System.out.println("Wrong number! Try again ");
                    return;
                }
    }
    public static void printShapesMenu() {
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Right triangle");
        Scanner input = new Scanner(System.in);
        int subOption = input.nextInt();
        while (subOption < 0 || subOption > 4){
            System.out.println("Wrong number! Try again");
            return;
        }
        }
    public static void printCollections(ArrayList <Shape> list){
        if (list.size() == 0){
            System.out.println("There is no shape in list. ");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }
    public static void printListOfShapes(ArrayList <Shape> list){
        if (list.size() == 0){
            System.out.println("There is no shape in list. ");
            return;
        }
        list.forEach(shape -> System.out.println(shape));
    }
    public static void printCalculatePerimeter(ArrayList <Shape> list){
        if (list.size() == 0){
            System.out.println("There is no shape in list. ");
            return;
        }
        list.forEach(shape -> System.out.println("The perimeter of this shape is " + shape.calculatePerimeter()));
    }
    public static void printCalculateArea(ArrayList <Shape> list){
        if (list.size() == 0){
            System.out.println("There is no shape in list. ");
            return;
        }
        list.forEach(shape -> System.out.println("The area of this shape is " + shape.calculateArea()));
    }

    public static void printMaxPerimeter(List<Shape>collectionOfShapes){

       if (collectionOfShapes.isEmpty())
       {
            System.out.println("There is no shape in list. ");
            return;
       }
        else{
            double max = Double.MIN_VALUE;
           for (int i = 0; i < collectionOfShapes.size(); i++) {
                if (max < collectionOfShapes.get(i).calculatePerimeter()){
                    max = collectionOfShapes.get(i).calculatePerimeter();
                    System.out.println(collectionOfShapes.get(i));
                    System.out.println("The perimeter/ circumference of this shape is " + max);
                }
            }
        }
    }
    public static void printMaxArea(List<Shape>collectionOfShapes){
        if (collectionOfShapes.isEmpty())
        {
            System.out.println("There is no shape in list. ");
            return;
        }
        else{
            double max = Double.MIN_VALUE;
            for (int i = 0; i < collectionOfShapes.size(); i++) {
                if (max < collectionOfShapes.get(i).calculateArea()){
                    max = collectionOfShapes.get(i).calculateArea();
                    System.out.println(collectionOfShapes.get(i));
                    System.out.println("The area of this shape is " + max);
                }
            }
        }

    }
    }

