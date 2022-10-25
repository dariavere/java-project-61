package hexlet.code;

import java.util.Random;

public class Utils {

    public static int getRandomNumber() {
        Random random = new Random();
        return random.ints(1,50).findFirst().getAsInt();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
