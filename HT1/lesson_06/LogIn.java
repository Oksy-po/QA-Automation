package lesson_06;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "admin" ;
        String password = "never" ;
        int attempt = 5;
        while (attempt >0 && attempt <=5 ){
            attempt --;
            System.out.println("Enter your username: ");
            String inputUsername = input.next();
            System.out.println("Enter your password: ");
            String inputPassword =input.next();
            if(inputUsername.equalsIgnoreCase(username) && inputPassword.equals(password) ){
                    System.out.println("You have successfully logged in! ");
                    break;
            }
            else {
                System.out.println("Input data is incorrect.Try again.You have " + attempt + " attempts");}
            }
        }
            }











