
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
    void return_list_with_size_n() {
        assertThat(fizzBuzzer.fizzBuzz(16).size(), is(equalTo(16)));
    }

    @Test
    void return_list_with_all_numbers_divisible_by_3_being_fizz() {
        List<String> output = fizzBuzzer.fizzBuzz(15);
        for (int i = 1; i < 15; i++)
            if (isDivisibleBy(i, 3))
                assertThat(output.get(i), is(equalTo("Fizz")));
    }

    @Test
    void return_list_with_all_numbers_divisible_by_5_being_buzz() {
        List<String> output = fizzBuzzer.fizzBuzz(15);
        for (int i = 1; i < 15; i++)
            if (isDivisibleBy(i, 5))
                assertThat(output.get(i), is(equalTo("Buzz")));
    }

    @Test
    void return_list_with_all_numbers_divisible_by_3_and_5_being_fizzbuzz() {
        List<String> output = fizzBuzzer.fizzBuzz(16);
        for (int i = 1; i < 16; i++)
            if (isDivisibleBy(i, 3) && isDivisibleBy(i, 5))
                assertThat(output.get(i), is(equalTo("FizzBuzz")));
    }

}
