package imperative;

public class Person {
    private final String _name;
    public final Gender _gender;

    public Person(String name, Gender gender) {
        this._name = name;
        this._gender = gender;
    }

    @Override
    public String toString(){
        return "Person {"+"name='"+_name +'\''+", gender=" +_gender + '}';
    }

    enum Gender{
        MALE,
        FEMALE
    }
}
