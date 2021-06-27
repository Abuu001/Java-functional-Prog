package MethodReference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MethodReference2 {

    static class Car{
        private String name;

        Car(){
        }

        Car(String name){
            this.name = name;
        }

        public  String getName(){
            return name;
        }

        public void setName(String n){
            this.name = n;
        }

        Consumer<String> printName = (carName)-> System.out.println(carName);

        public static String models(){
            return " Tx and V45";
        }
    }

    public static void main(String[] args) {
        //normal
        Car car1 = new Car();
        car1.printName.accept("mitsubishi");

        //
        Consumer<String> L1= (s) -> System.out.println(s);
        L1.accept("Toyota");

        //method reference
        Consumer<String> L2= System.out::print;
        L2.accept("BMw");

        Supplier<String> cc = Car::models;
        System.out.println(cc.get());

        String [] names = {"Abuu" ,"001"};

        //normal
        System.out.println(Stream.of(names).reduce(" ",(val,str) -> val.concat(str)));

        //method reference
        System.out.println(Stream.of(names).reduce("",String::concat));

        Function<String,Car>  factory = Car::new; //calling constructor
        Car ford = factory.apply("ford GTI");
        System.out.println(ford.getName());
    }
}
