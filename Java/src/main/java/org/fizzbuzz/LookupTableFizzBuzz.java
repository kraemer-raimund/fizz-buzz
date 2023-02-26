package org.fizzbuzz;

import java.util.Map;

public class LookupTableFizzBuzz {

    // The special outputs for inputs modulo 15. The sequence modulo 15 repeats infinitely.
    private static final Map<Integer, String> lookupTable = Map.of(
            3, "Fizz",
            5, "Buzz",
            6, "Fizz",
            9, "Fizz",
            10, "Buzz",
            12, "Fizz",
            0, "FizzBuzz" // 15 mod 15
    );

    public String map(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number is non-positive, but a positive number is expected.");
        }

        return lookupTable.getOrDefault(number % 15, String.valueOf(number));
    }
}
