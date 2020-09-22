
package com.jaredengler;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzer {

    static boolean isDivisibleBy(int n, int d) {
        return n % d == 0;
    }

    List<String> fizzBuzz(Integer n) {

        if (null == n)
            return List.of();

        return IntStream.range(0, n).boxed()
            .map(Object::toString)
            .collect(Collectors.toList());

    }

}
