package edu.kis.vh.nursery.list;

public class Node {

    public final int value;
    public Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}
