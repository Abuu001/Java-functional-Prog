package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

       Object value= Optional.ofNullable(null)
                .orElseGet(()->"optional value");

       System.out.println(value);

       Optional.ofNullable("abu@gmail.com")
                .ifPresent(email-> System.out.println("Sending email to " + email));
    }
}
