package java8;

import java.util.Random;


//TODO
//Write unit-tests for this class
//that check its functionality and especially that the class returns random values
public class RandomGenerator {

    private final Random random = new Random();

    private int counter = 0;

    private int delta;

    private double multiplier = 1.5;

    public int generate(int max) {
        if (counter >= max - 1) {
            counter = 0;
            return counter;
        }
        return ++counter;
        //return random.nextInt(max);
    }
}

//return (int) (System.nanoTime() % max);
//        int avg = max/2;
//        counter ++;
//        if(counter >= 4) {
//            counter = -4;
//        }
//        return avg + counter;
//        counter += delta;
//        delta ++;
//        if(delta < 0) {
//            delta = Math.abs(delta);
//        }
//        counter *= multiplier;
//        multiplier *= 2;
//        if(counter >= max) {
//            counter = counter % max;
//        }
//        if(counter < 0) {
//            counter = 0;
//        }
// return counter;