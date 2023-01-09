package lesson_08;

import java.util.HashMap;

public class Countries {
    public static void main(String[] args) {
        HashMap<String,String> cityCountry = new HashMap<>();
        cityCountry.put("Jerusalem","Israel");
        cityCountry.put("Paris","France");
        cityCountry.put("Seoul","South Korea");
        cityCountry.put("Rome","Italy");
        cityCountry.put("Berlin","Germany");
        cityCountry.put("Minsk","Belarus");
        cityCountry.put("London","England");
        cityCountry.put("Warsaw","Poland");
        cityCountry.put("Brussels","Belgium");
        cityCountry.put("Ottawa","Canada");
        cityCountry.forEach((city,country) -> System.out.print(country + "  "));
        System.out.println();
        cityCountry.forEach((city,country) -> System.out.println(city + " - " + country));
        System.out.println(cityCountry.containsValue("London"));
        System.out.println(cityCountry.containsKey("Ottawa"));
    }
}
