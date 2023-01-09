package lesson_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DublicateNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int numbers[] = new int[100];
        for (int i = 0; i < numbers.length; i++) {
                 numbers[i]= random.nextInt(50);
        }
        for (int number :numbers){
            if (map.containsKey(number)){
                map.put(number,map.get(number)+1);
            }
        else {
            map.put(number,1);
        }
        }
        map.forEach((number,amount) -> System.out.println(number + " - " + amount));
    }
}
