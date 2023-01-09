package lesson_08;

import java.util.HashMap;

public class DublicateChars {
    public static void main(String[] args) {
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like";
    char[] textCharacters = text.toCharArray();
       HashMap<Character,Integer> collections = new HashMap<>();
        for (char letter : textCharacters) {
            if (collections.containsKey(letter)){
                collections.put(letter,collections.get(letter)+1);
            }
            else {
                collections.put(letter, 1);
            }
            
        }
        collections.forEach((letter,number) -> System.out.println(letter + " " + number));

    }
}
