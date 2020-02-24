package Node;

import person.Person;

public class Node {
    private Person val;
    private Node next;
    public Node(Person val) {
        this.val = val;
    }
    public Person getVal() {
        return val;
    }
    public void setVal(Person val) {
        this.val = val;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
