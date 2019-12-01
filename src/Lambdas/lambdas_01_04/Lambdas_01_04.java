package Lambdas.lambdas_01_04;

public class Lambdas_01_04 {

    public static void main(String[] args) {

        //example of passing multiple values to a method using lambda
        //notice that I do NOT have to specify the data type of a and b

        Calculate add = (a, b) -> a + b;
        Calculate difference = (a, b) -> Math.abs(a - b);
        Calculate divide = (a, b) -> ( b != 0 ? a / b : 0);
        Calculate multiply = (a, b) -> a * b;

        System.out.println(add.calc(12, 13));
        System.out.println(difference.calc(12, 13));
        System.out.println(divide.calc(12, 13));
        System.out.println(divide.calc(12, 0));
        System.out.println(multiply.calc(12, 13));
    }
}
