
package com.jaredengler;

import static com.jaredengler.FizzBuzzer.isDivisibleBy;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzerShould {

    private static final int MAX_SIZE = 100000000;

    FizzBuzzer fizzBuzzer;

    @BeforeEach
    void setup() {
        fizzBuzzer = new FizzBuzzer();
    }

    @Test
    void return_list() {
        assertThat(fizzBuzzer.fizzBuzz(null), is(instanceOf(List.class)));
    }

    @Test
    void return_empty_list_when_0() {
        assertThat(fizzBuzzer.fizzBuzz(0).isEmpty(), is(true));
    }

    @Test
    void return_list_with_all_numbers_divisible_by_3_being_fizz() {
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(MAX_SIZE);
        IntStream.rangeClosed(1, MAX_SIZE).parallel().forEach(i -> {
            if (isDivisibleBy(i, 3) && !(isDivisibleBy(i, 5) || isDivisibleBy(i, 15)))
                assertThat(fizzBuzzOutput.get(i - 1), is(equalTo("Fizz")));
        });
    }

    @Test
    void return_list_with_all_numbers_divisible_by_5_being_buzz() {
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(MAX_SIZE);
        IntStream.rangeClosed(1, MAX_SIZE).parallel().forEach(i -> {
            if (isDivisibleBy(i, 5) && !(isDivisibleBy(i, 3) || isDivisibleBy(i, 15)))
                assertThat(fizzBuzzOutput.get(i - 1), is(equalTo("Buzz")));
        });
    }

    @Test
    void return_list_with_all_numbers_divisible_by_3_and_5_being_fizzbuzz() {
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(MAX_SIZE);
        IntStream.rangeClosed(1, MAX_SIZE).parallel().forEach(i -> {
            if (isDivisibleBy(i, 15))
                assertThat(fizzBuzzOutput.get(i - 1), is(equalTo("FizzBuzz")));
        });
    }

}
