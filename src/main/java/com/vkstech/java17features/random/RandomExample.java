package com.vkstech.java17features.random;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * Java 17 introduces new random generator interfaces in java.util.random,
 * enabling flexible and predictable random sequences, as well as stream-based random generation.
 */
public class RandomExample {

    public static void main(String[] args) {
        // Get a generator instance
        RandomGenerator generator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create();

        // Generate random numbers
        System.out.println(generator.nextInt(100)); // Random integer from 0 to 99
        System.out.println(generator.nextDouble()); // Random double between 0.0 and 1.0

        // Stream-based generation of random numbers
        generator.ints(5, 1, 10)
                .forEach(System.out::println); // Five random integers between 1 and 9
    }
}
