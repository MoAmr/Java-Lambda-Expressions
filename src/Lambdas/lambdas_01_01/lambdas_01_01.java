/*
 * This program explains the syntax of using lambda expressions in Java
 */

package Lambdas.lambdas_01_01;

import java.util.function.*;

public class lambdas_01_01 {

    public static void main(String[] args) {

        //using the test method of Predicate
        //Predicates - takes one argument, return a Boolean
        Predicate<String> stringLen = (s) -> s.length() < 10;
        System.out.println(stringLen.test("apples") + " - Apples is less than 10");

        //Consumer example uses accept method
        //Consumer - accepts single argument with no return value.
        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCDefghijklmnopQRSTuvWxyZ");

        //Function example
        //Function - accepts one argument and produces a result.
        Function<Integer, String> converter = (num) -> Integer.toString(num);
        System.out.println("Length of 26: " + converter.apply(26).length());

        //Supplier example
        //Supplier - represents a supplier of results.
        Supplier<String> s = () -> "Java is fun!";
        System.out.println(s.get());

        //Binary Operator example
        //BinaryOperator - takes two arguments and returns one.
        BinaryOperator<Integer> add = (a, b) -> (a + b);
        System.out.println("add 10 + 25: " + add.apply(10, 25));

        //Unary Operator example
        //UnaryOperator - single argument with a return value.
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));

    }
}
