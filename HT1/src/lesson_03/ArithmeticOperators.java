package src.lesson_03;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        double c = 20;
        double d = 7;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        double result = (c / d);
        System.out.println("c / d = " + result );
        System.out.println("result * d = " + (result * d));
        System.out.println("c % d = " + (c % d));

        int resultOfint = a / b;
//        int resultOfintdouble = a * c;
        double resultOfintdouble = c / b;
        System.out.println("resultOfintdouble = " + resultOfintdouble);
        System.out.println("a / 0 = " + (a / 0));
    }
}
