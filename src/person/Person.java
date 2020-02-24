package person;

import java.util.ArrayList;

public class Person {
    String firstName;
    String lastName;
    String email;
    ArrayList<String> phoneNumber;

    public Person(String firstName, String lastName, String email, ArrayList<String> phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Person() {
    }
}
