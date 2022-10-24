package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void printMessage() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = readName();
        System.out.println("Hello, " + name + "!");
    }

    private static String readName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();
        return name;
    }
}
