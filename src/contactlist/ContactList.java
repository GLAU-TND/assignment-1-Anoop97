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

    private boolean addFirst(Person data) {
        head = new Node<>(data, null);
        size++;
        return true;
    }

    private boolean addAfter(Person data, Node<Person> node) {
        node.next = new Node<>(data, node.next);
        size++;
        return true;
    }

    private boolean add(Person data, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (index == 0) {
            return addFirst(data);
        } else {
            Node<Person> temp = getData(index);
            return addAfter(data, temp);
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
