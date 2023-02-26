package org.fizzbuzz;

public class CountdownFizzBuzz {

    public String map(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number is non-positive, but a positive number is expected.");
        }

        int fizzCountdown = number;
        int buzzCountdown = number;
        int fizzBuzzCountdown = number;

        while (fizzCountdown > 0) {
            fizzCountdown -= 3;
        }

        while (buzzCountdown > 0) {
            buzzCountdown -= 5;
        }

        while (fizzBuzzCountdown > 0) {
            fizzBuzzCountdown -= 15;
        }

        if (fizzBuzzCountdown == 0) {
            return "FizzBuzz";
        } else if (fizzCountdown == 0) {
            return "Fizz";
        } else if (buzzCountdown == 0) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
