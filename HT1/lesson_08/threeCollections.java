package lesson_08;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class threeCollections {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <String> names = new ArrayList<>();
        ArrayList<Integer> numbers =new ArrayList<>();
        HashMap<Integer,String> map = new HashMap<>();
        names.add("Oksana");
        names.add("Polina");
        names.add("Lisa");
        names.add("Nika");
        names.add("Vika");
        names.add("Kristina");
        names.add("Dima");
        names.add("Roma");
        names.add("Vlad");
        names.add("Igor");
        int size = 10;
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(11));
            map.put(numbers.get(i), names.get(i));
        }
        map.forEach((number,name) -> System.out.println(number + " - " + name));
            }
            }

