package snakes_and_ladders;

import java.util.Random;

public class DiceService {
    private static final Random random = new Random();
    private DiceService() {}
    public static int roll(int numberOfDice) {
        return random.nextInt(numberOfDice * 6) + 1;
    }
}
