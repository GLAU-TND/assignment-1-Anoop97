package contactlist;

import contactADT.ContactADT;

public class ContactList<Person> implements ContactADT<Person> {
    @Override
    public boolean add(Person data) {
        return false;
    }

    @Override
    public void view() {

    }

    @Override
    public Person delete() {
        return null;
    }
}
