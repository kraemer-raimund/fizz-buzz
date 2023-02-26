package org.fizzbuzz;

public class SeparateCountersFizzBuzz {

    public String map(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number is non-positive, but a positive number is expected.");
        }

        int fizzCounter = 0;
        int buzzCounter = 0;
        int fizzBuzzCounter = 0;

        for (int i = 0; i < number; i++) {
            fizzCounter++;
            if (fizzCounter == 3) {
                fizzCounter = 0;
            }

            buzzCounter++;
            if (buzzCounter == 5) {
                buzzCounter = 0;
            }

            fizzBuzzCounter++;
            if (fizzBuzzCounter == 15) {
                fizzBuzzCounter = 0;
            }
        }

        if (fizzBuzzCounter == 0) {
            return "FizzBuzz";
        } else if (fizzCounter == 0) {
            return "Fizz";
        } else if (buzzCounter == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
