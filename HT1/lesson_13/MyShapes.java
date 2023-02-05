package lesson_13;

import java.util.*;

public class MyShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Shape> collectionOfShapes = new ArrayList<>();
        Messages.printMainMenu();
        int option = input.nextInt();
        while (option > 0 && option < 8) {
            System.out.println("You have chosen " + option);
            switch (option) {
                case 1:
                    Messages.printShapesMenu();
                    int subOption = input.nextInt();
                        System.out.println("Choose your color");
                        String color = input.next();
                        switch (subOption) {
                            case 1:
                                System.out.println("Enter  square side");
                                collectionOfShapes.add(new Square(color, input.nextDouble()));
                                break;
                            case 2:
                                System.out.println("Enter rectangle width, height ");
                                collectionOfShapes.add(new Rectangle(color, input.nextDouble(), input.nextDouble()));
                                break;
                            case 3:
                                System.out.println("Enter circle radius");
                                collectionOfShapes.add(new Circle(color, input.nextDouble()));
                                break;
                            case 4:
                                System.out.println("Enter right triangle side A, side B, side C");
                                collectionOfShapes.add(new RightTriangle(color, input.nextDouble(), input.nextDouble(), input.nextDouble()));
                                break;
                        }
                    break;
                case 2:
                   Messages.printListOfShapes((ArrayList<Shape>) collectionOfShapes);
                    break;
                case 3:
                    Messages.printCalculatePerimeter((ArrayList<Shape>) collectionOfShapes);
                    break;
                case 4:
                   Messages.printCalculateArea((ArrayList<Shape>) collectionOfShapes);
                    break;
                case 5:
                   Messages.printMaxPerimeter(collectionOfShapes);
                    break;
                case 6:
                    Messages.printMaxArea(collectionOfShapes);
                    break;
                case 7:

                    System.out.println("Exiting....");
                    return;
            }
        Messages.printMainMenu();
        option = input.nextInt();
        }
        System.out.println("Good Bye!");
    }
    }




