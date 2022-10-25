package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Choose.chooseGame;
import static hexlet.code.Even.startEvenGame;
import static hexlet.code.Greet.greetAndGetUserName;

public class App {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = chooseGame();
        if (choice == 1) {
            greetAndGetUserName();
            scanner.close();
        } else if (choice == 2) {
            startEvenGame();
            scanner.close();
        } else {
            scanner.close();
        }
    }
}
