package functionalInterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        //normal func
        Customer faith = new Customer("Faith", "07251525156");
        greetCustomer(faith);

        //consumer func
        Customer maria = new Customer("Maria", "07238121834");
        greetCustomerConsumer.accept(maria);
    }

    //consumer func
    //consumers r used for void functions
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello " + customer.customerName + ", thanks for registering phone No :" + customer.customerPhoneNumber);

    //normal func
    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone No :" + customer.customerPhoneNumber);
    }

    static class Customer {
        public final String customerName;
        public final String customerPhoneNumber;

        Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
