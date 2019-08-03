package com.stackroute.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {

        // create a list of integers
        List<Integer> inputNumber = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method using Stream
        List<Integer> SquareOfNumber = inputNumber.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(SquareOfNumber);

        // demonstration of forEach method
        inputNumber.stream().map(x -> x * x).forEach(y -> System.out.println(y));

    }
}
