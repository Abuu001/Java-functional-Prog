package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+0723312121",
                LocalDate.of(2000,1,1)
        );

        CustomerValidatorService validatorService = new CustomerValidatorService();

        System.out.println(validatorService.isValid(customer));

        // if valid we can store customer in db

        //using combinater pattern

      /*  ValidationResult result= isPhoneNumberValid()
                .andThen(isEmailValid())
                 .and(isAnAdult())
                 .apply(customer);*/


    }
}
