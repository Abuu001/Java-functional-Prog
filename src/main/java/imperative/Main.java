package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("===========================Imperative approach=============================");
         List<Person> people =List.of(
                 new Person("John", Person.Gender.MALE),
                 new Person("Maria", Person.Gender.FEMALE),
                 new Person("Lizzy", Person.Gender.FEMALE),
                 new Person("Abu", Person.Gender.MALE),
                 new Person("Ken", Person.Gender.MALE),
                 new Person("Jane", Person.Gender.FEMALE)
         );

         //imperative approach (finding females)
        List<Person> females=new ArrayList<>();

        for (Person person:people){
          if(person._gender.equals(Person.Gender.FEMALE)){
             females.add(person);
           }

        }

        //printing out each female
        for (Person female:females){
            System.out.println(female);
        }

        System.out.println("===========================Declarative approach=============================");

        //Declarative aproach
        people.stream()
                .filter(person -> Person.Gender.FEMALE.equals(person._gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
