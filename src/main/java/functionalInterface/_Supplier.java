package functionalInterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlSupplier.get());
    }

    //normal func
    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    //using supplier
    // takes no argument and returns a result.
    static Supplier<String> getDBConnectionUrlSupplier=()
            -> "jdbc://localhost:5432/books";
}
