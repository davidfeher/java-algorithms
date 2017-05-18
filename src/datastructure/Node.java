package datastructure;

public class Node<E> {
    private Node next;
    private Node previous;

    private E data;

    public Node(E data) {
        this.next = null;
        this.data = data;
    }

    public Node(E data, Node next) {
        this.next = next;
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
