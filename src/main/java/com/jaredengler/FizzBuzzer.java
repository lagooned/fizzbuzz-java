
package com.jaredengler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzer {

    static boolean isDivisibleBy(int n, int d) {
        return n % d == 0;
    }

    List<String> fizzBuzz(Integer n) {

        if (null == n || n < 1)
            return List.of();

        return IntStream.rangeClosed(1, n).boxed().map(i -> {
            if (isDivisibleBy(i, 3) && isDivisibleBy(i, 5))
                return "FizzBuzz";
            else if (isDivisibleBy(i, 3))
                return "Fizz";
            else if (isDivisibleBy(i, 5))
                return "Buzz";
            else
                return i.toString();
        }).collect(Collectors.toList());

    }

}
