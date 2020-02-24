package contactlist;

import contactADT.ContactADT;

public class ContactList<Person> implements ContactADT<Person> {
    public int size = 0;
    private Node<Person> head = null;

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

    private Node<Person> getData(int index) {
        Node<Person> response = head;
        for (int i = 0; i < index && response != null; i++) {
            response = response.getNext();
        }
        return response;
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
