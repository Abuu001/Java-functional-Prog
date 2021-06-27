package MethodReference;

import java.util.function.BiFunction;

public class MethodReference1 {



    public static void main(String[] args) {
        System.out.println(addNumbers(2,3));

        System.out.println(sumTwoNumbers.apply(10,20));

       BiFunction<Integer,Integer,Double> biFunctionAdd = MethodReference1::addNumbers;
        System.out.println( biFunctionAdd.apply(3,3));
    }

    public static Double addNumbers(Integer i ,Integer j){
        return i + j.doubleValue();
    }

    private static BiFunction<Integer,Integer,Double> sumTwoNumbers = (val1 ,val2) -> val1.doubleValue() + val2;
}
