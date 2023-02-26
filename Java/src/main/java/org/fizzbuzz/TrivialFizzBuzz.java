package org.fizzbuzz;

public class TrivialFizzBuzz {

    public TrivialFizzBuzz() {
    }

    public String map(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number is non-positive, but a positive number is expected.");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return  "Fizz";
        }

        if (number % 5 == 0) {
            return  "Buzz";
        }

        return String.valueOf(number);
    }
}
