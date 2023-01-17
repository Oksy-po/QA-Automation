package lesson_10;



import java.util.HashSet;



public class MyCats {
    public static void main(String[] args) {
        HashSet myCats = new HashSet();
        myCats.add(new Cat("British shorthair","grey",2));
        myCats.add(new Cat("Devon rex","white",3));
        myCats.add(new Cat("Maine coon","red",4));
        myCats.add(new Cat("Ocicat","black",1));
        myCats.add(new Cat("Pixie bob","black and red",1));
        myCats.forEach(System.out::println);



    }

}
