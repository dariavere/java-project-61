package hexlet.code;

import static hexlet.code.App.scanner;

public class Choose {
    public static int chooseGame() {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit\n");
        String choiceStr = scanner.next();
        int choice = Integer.parseInt(choiceStr);
        System.out.println("Your choice: " + choice);
        return choice;
    }
}
