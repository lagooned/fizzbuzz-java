
package com.jaredengler;

import static com.jaredengler.FizzBuzzer.isDivisibleBy;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzzerShould {

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
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(3);
        for (int i = 0; i < 3; i++) {
            if (isDivisibleBy(i + 1, 3)) {
                assertThat(fizzBuzzOutput.get(i), is(equalTo("Fizz")));
            }
        }
    }

    @Test
    void return_list_with_all_numbers_divisible_by_5_being_buzz() {
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(5);
        for (int i = 0; i < 5; i++) {
            if (isDivisibleBy(i + 1, 5)) {
                assertThat(fizzBuzzOutput.get(i), is(equalTo("Buzz")));
            }
        }
    }

    @Test
    void return_list_with_all_numbers_divisible_by_3_and_5_being_fizzbuzz() {
        List<String> fizzBuzzOutput = fizzBuzzer.fizzBuzz(15);
        for (int i = 0; i < 15; i++) {
            if (isDivisibleBy(i + 1, 15)) {
                assertThat(fizzBuzzOutput.get(i), is(equalTo("FizzBuzz")));
            }
        }
    }

}
