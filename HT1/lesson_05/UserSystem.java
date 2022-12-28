package lesson_05;

import java.util.Scanner;

public class UserSystem {
    public static void main(String[] args) {
        String correctUsername = "Admin";
        String correctPassword = "P@ssword";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your username: ");
        String username = input.nextLine();
        if(username.equalsIgnoreCase(correctUsername)) {
            System.out.println("Enter your password: ");
        }
        else {
                System.out.println("Нет пользователя с таким именем! ");
        }
        String password = input.nextLine();
        if (password.equals(correctPassword))
        {
            System.out.println("Здравствуйтe " + correctUsername + ",Вы вошли в систему.");
        }
        else {
            System.out.println("Вы ввели неверный пароль!");
    }

    }
}
