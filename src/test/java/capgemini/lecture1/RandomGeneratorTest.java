package capgemini.lecture1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//TODO add unit-tests that check that RandomGenerator returns actually random numbers
class RandomGeneratorTest {

    RandomGenerator randomGenerator = new RandomGenerator();

    @BeforeEach
    void setup() {
        randomGenerator = new RandomGenerator();
    }

    @Test
    void random_maxOne_returnsOne() {
        int random = randomGenerator.random(1);
        assertEquals(1, random);
    }
}