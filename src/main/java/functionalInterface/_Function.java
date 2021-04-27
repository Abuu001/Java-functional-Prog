package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment1=increment(0);
        System.out.println(increment1);

        int increment2= incrementBYOneFunction.apply(1);
        System.out.println(increment2);

        //byfunc takes 2 args
        System.out.println(incrementByOneAndMultiply(4,100));


    }

    //normal approach
    static int increment (int number){
        return  number+1;
    }

    //functional approach
    static Function<Integer,Integer> incrementBYOneFunction=number -> number++;

    //normal approach
    static int incrementByOneAndMultiply (int number,int numToMultiply){
        return  (number+1) *numToMultiply;
    }

    //Bifunctional
    BiFunction<Integer,Integer,Integer>incrementByOneAndMultiplyByFuntion=(numberToIncrementByOne,numberToMultiplyBy)
            ->(numberToIncrementByOne +1)*numberToMultiplyBy;
}
