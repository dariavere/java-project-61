package hexlet.code;

import static hexlet.code.App.scanner;

public class Greet {
    public static String greetAndGetUserName() {
        askName();
        String name = scanner.next();
        greetByName(name);
        return name;
    }

    private static void askName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
    }

    private static void greetByName(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
