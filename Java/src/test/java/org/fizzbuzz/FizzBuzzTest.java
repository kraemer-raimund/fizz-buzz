package org.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource(textBlock = """
            1, 1
            2, 2
            3, Fizz
            4, 4
            5, Buzz
            6, Fizz
            7, 7
            8, 8
            9, Fizz
            10, Buzz
            11, 11
            12, Fizz
            13, 13
            14, 14
            15, FizzBuzz
            19, 19
            20, Buzz
            21, Fizz
            25, Buzz
            29, 29
            30, FizzBuzz
            40, Buzz
            42, Fizz
            72, Fizz
            73, 73
            90, FizzBuzz
            91, 91,
            95, Buzz
            99, Fizz,
            100, Buzz
            """)
    void shouldMapPositiveNumbersToCorrectString(int number, String expected) {
        final var trivialFizzBuzz = new TrivialFizzBuzz();
        assertThat(trivialFizzBuzz.map(number)).isEqualTo(expected);

        final var noModuloFizzBuzz = new NoModuloFizzBuzz();
        assertThat(noModuloFizzBuzz.map(number)).isEqualTo(expected);

        final var separateCountersFizzBuzz = new SeparateCountersFizzBuzz();
        assertThat(separateCountersFizzBuzz.map(number)).isEqualTo(expected);

        final var countdownFizzBuzz = new CountdownFizzBuzz();
        assertThat(countdownFizzBuzz.map(number)).isEqualTo(expected);

        final var lookupTableFizzBuzz = new LookupTableFizzBuzz();
        assertThat(lookupTableFizzBuzz.map(number)).isEqualTo(expected);

        final var lookupTableNoModuloFizzBuzz = new LookupTableNoModuloFizzBuzz();
        assertThat(lookupTableNoModuloFizzBuzz.map(number)).isEqualTo(expected);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, -1, -100})
    void shouldThrowExceptionForNonPositiveInputs(int number) {
        final var trivialFizzBuzz = new TrivialFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> trivialFizzBuzz.map(number));

        final var noModuloFizzBuzz = new NoModuloFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> noModuloFizzBuzz.map(number));

        final var separateCountersFizzBuzz = new SeparateCountersFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> separateCountersFizzBuzz.map(number));

        final var countdownFizzBuzz = new CountdownFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> countdownFizzBuzz.map(number));

        final var lookupTableFizzBuzz = new LookupTableFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> lookupTableFizzBuzz.map(number));

        final var lookupTableNoModuloFizzBuzz = new LookupTableNoModuloFizzBuzz();
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> lookupTableNoModuloFizzBuzz.map(number));
    }
}
