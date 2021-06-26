package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09323232323"));

        System.out.println("======with predicate=====");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09323232323"));
    }

    //normal func
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() ==11;
    }

    //predicate func
    //when working with boolean values
    static Predicate<String> isPhoneNumberValidPredicate= phoneNumber->
            phoneNumber.startsWith("07") && phoneNumber.length() ==11;
}
