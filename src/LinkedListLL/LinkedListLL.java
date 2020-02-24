package LinkedListLL;

import Node.Node;
import person.Person;

public class LinkedListLL {
    Person person;
    private Node first;
    private Node last;

    public void addLast(Person person) {
        Node node = new Node(person);
        if (isEmpty()) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            last = node;
        }
    }
    public void addFirst(Person person){
        Node node = new Node(person);
        if(isEmpty()){
            first = node;
            last = node;
        }
        else{
            node.setNext(first);
            first = node;
        }
    }

    public boolean isEmpty() {
        boolean response = false;
        if(first == null){
            response = true;
        }
        return response;
    }
    public boolean exist(String fName){
        if(indexOf(fName) != -1){
            return true;
        }
        return false;
    }
    public int indexOf(String fName){
        Node current = first;
        int res = 0;
        while(current!=null){
            if(current.getVal().getFirstName().equals(fName)){
                return res;
            }
            res++;
            current = current.getNext();
        }
        return -1;
    }
    public void removeLast() {
        var previousNode = getPreviousNode(last);
        last = previousNode;
        last.setNext(null);
    }

    private Node getPreviousNode(Node node) {
        var current = first;
        while (current.getNext() != null) {
            if (current.getNext() == node) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void deleteNode(int position) {
        if (first == null)
            return;
        Node temp = first;
        if (position == 0) {
            first = temp.getNext();
            return;
        }
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.getNext();
        if (temp == null || temp.getNext() == null)
            return;
        Node next = temp.getNext().getNext();
        temp.setNext(next);
    }

    public int size() {
        var current = first;
        int index = 1;
        while (current.getNext() != null) {
            current = current.getNext();
            index++;
        }
        return index;
    }

    public void display() {
        var current = first;
        System.out.println("Contact list--->");
        System.out.println();
        while (current != null) {
            System.out.println("-----------------------*-------------------------");
            System.out.println("Name:" + current.getVal().getFirstName() + " " + current.getVal().getLastName());
            System.out.println("Contacts:" + current.getVal().getContacts().toString());
            System.out.println("Email:" + current.getVal().getEmail());
            System.out.println("------------------------*-------------------------");
            System.out.println();
            current = current.getNext();
        }
        System.out.println();
    }

    public void displayOne() {
        var current = first;
        int count = 0;
        System.out.println("-----------------------*-------------------------");
        while (current != null) {
            System.out.println(count + " Name:" + current.getVal().getFirstName() + " " + current.getVal().getLastName());
            current = current.getNext();
            count++;
        }
        System.out.println("------------------------*-------------------------");
        System.out.println();
    }

    public void getNode(int pos) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (index == pos) {
                System.out.println();
                System.out.println("-----------------------*-------------------------");
                System.out.println("Name:" + current.getVal().getFirstName() + " " + current.getVal().getLastName());
                System.out.println("Contacts:" + current.getVal().getContacts().toString());
                System.out.println("Email:" + current.getVal().getEmail());
                System.out.println("------------------------*-------------------------");
                System.out.println();
                break;
            }
            index++;
            current = current.getNext();
        }
    }
}
