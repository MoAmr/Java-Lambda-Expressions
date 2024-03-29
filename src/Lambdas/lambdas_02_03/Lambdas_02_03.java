package Lambdas.lambdas_02_03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Lambdas_02_03 {

    public static void main(String[] args) {

        IntStream.range(1, 4)
                .forEach(System.out::println);

        //find the average of the numbers squared
        Arrays.stream(new int[]{1, 2, 3, 4})
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        //map doubles to ints
        Stream.of(1.5, 2.6, 3.7)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);

    }
}
