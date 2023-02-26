package org.fizzbuzz;

public class NoModuloFizzBuzz {

    public NoModuloFizzBuzz() {
    }

    public String map(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Number is non-positive, but a positive number is expected.");
        }

        if (isDivisible(number, 3) && isDivisible(number, 5)) {
            return "FizzBuzz";
        }

        if (isDivisible(number, 3)) {
            return  "Fizz";
        }

        if (isDivisible(number, 5)) {
            return  "Buzz";
        }

        return String.valueOf(number);
    }

    private boolean isDivisible(int number, int divisor) {
        int quotient = number / divisor;
        int remainder =  number - (quotient * divisor);
        return remainder == 0;
    }
}
