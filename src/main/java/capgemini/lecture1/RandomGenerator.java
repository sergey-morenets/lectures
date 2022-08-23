package capgemini.lecture1;

import java.util.Random;

public class RandomGenerator {

    private final Random random = new Random();

    public int random(int max) {
        return random.nextInt(max);
    }
}
