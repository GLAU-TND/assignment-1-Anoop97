package contactlist;

import contactADT.ContactADT;

public class ContactList<Person> implements ContactADT<Person> {

    class Node<Person> {
        Person data;
        Node<Person> next;

        private Node(Person data, Node<Person> next) {
            this.data = data;
            this.next = next;
        }

        private Person getData() {
            return data;
        }

        private Node<Person> getNext() {
            return next;
        }
    }
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
