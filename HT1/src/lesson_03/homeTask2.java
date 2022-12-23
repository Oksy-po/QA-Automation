package src.lesson_03;

public class homeTask2 {
    public static void main(String[] args) {
// Task 1 Part 1
        int i1 = 5;
        int i2 = 11;

        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20l;
        double result = 0;
        result = (i2 / i1) + (d2 % i1) - l;

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("l = " + l);
        System.out.println("result =  " + result);

//  Task 1 Part 2
        int a = 5;
        int b = 8;
        int result1 = a -- - -- a + ++ a;
        int result2 = ++b - b ++ + ++ b;

        double c = 5;
        double d = 8;
        double result3 = c -- - -- c + ++ c;
        double result4 = ++d - d ++ + ++ d;

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);

// Task 2
        int x = 10;
        int y = 12;
        int z = 3;
        int output1 = x += y - x ++ * z;
        int output2 = z = -- x - y * 5;
        int output3 = y /= x + 5 % z;
        int output4 = z = x ++ + y * 5;
        int output5 = x = y - x ++ * z;

        System.out.println("output1 = " + output1);
        System.out.println("output2 = " + output2);
        System.out.println("output3 = " + output3);
        System.out.println("output4 = " + output4);
        System.out.println("output5 = " + output5);
    }
}
