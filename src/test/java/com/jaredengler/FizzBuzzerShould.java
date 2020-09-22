
package com.jaredengler;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.instanceOf;
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

}
