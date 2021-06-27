package MethodReference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceComparator {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4);
            //normal
        numbers.forEach(p-> System.out.println(p));

        System.out.println("=========Lambda expression============");
        numbers.forEach(System.out::println);

        List<String> names = Arrays.asList("Abu","sid","kim");
        names.forEach(System.out::println);
    }

}
