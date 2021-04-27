package streams;

import java.util.List;
import java.util.stream.Collectors;

public class _Streams {

    public static void main(String[] args) {


        List<Person> people =List.of(
                new Person("John", Person.Gender.MALE),
                new Person("Maria", Person.Gender.FEMALE),
                new Person("Lizzy", Person.Gender.FEMALE),
                new Person("Abu", Person.Gender.MALE),
                new Person("Ken", Person.Gender.MALE),
                new Person("Jane", Person.Gender.FEMALE),
                new Person("Bob", Person.Gender.PREFER_NOT_TO_SAY)
        );


        people.stream()
                .map(person->person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


       boolean containsOnlfemales = people.stream()
                .allMatch(person->Person.Gender.FEMALE.equals(person.gender));

        System.out.println(containsOnlfemales);
    }

     static class Person {
        private final String name;
        public final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person {"+"name='"+name +'\''+", gender=" +gender + '}';
        }

        enum Gender{
            MALE,
            FEMALE,
            PREFER_NOT_TO_SAY
        }
    }

}
