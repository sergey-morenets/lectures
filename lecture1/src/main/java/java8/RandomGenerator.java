package java8;

import java.util.Random;


//TODO
//Write unit-tests for this class
//that check its functionality and especially that the class returns random values
public class RandomGenerator {

    private final Random random = new Random();

    private int counter = 0;

    public int generate(int max) {
        if (counter >= max) {
            counter = 0;
        }
        return ++counter;
        //return max - 1;
        //return random.nextInt(max);
    }
}
