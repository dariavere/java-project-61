package hexlet.code;

import static hexlet.code.App.scanner;
import static hexlet.code.Greet.greetAndGetUserName;
import static hexlet.code.Utils.getRandomNumber;
import static hexlet.code.Utils.isEven;

public class Even {
    public static void startEvenGame() {
        String name = greetAndGetUserName();
        int count = 0;

        printCondition();

        while (count < 3) {
            int randomNumber = getRandomNumber();
            String correctAnswer = getCorrectAnswer(randomNumber);
            askQuestion(randomNumber);
            String answer = scanner.next();

            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
                count++;
                if (isWin(count)) {
                    printCongratulationsByName(name);
                }
            } else {
                count = 0;
                printCorrectAnswer(correctAnswer, answer);
                System.out.println("Let's try again, " + name + "!");
            }
        }
    }

    private static void printCorrectAnswer(String correctAnswer, String answer) {
        System.out.println(answer + " is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
    }

    private static boolean isWin(int count) {
        return count == 3;
    }

    private static void printCongratulationsByName(String name) {
        System.out.println("Congratulations, " + name + "!");
    }

    private static void printCondition() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }

    private static void askQuestion(int randomNumber) {
        System.out.println("Question: " + randomNumber);
        System.out.println("Your answer: ");
    }

    private static String getCorrectAnswer(int number) {
        if (isEven(number)) {
            return "yes";
        } else {
            return "no";
        }
    }
}

