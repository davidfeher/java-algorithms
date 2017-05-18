package datastructure.linkedlist;

import datastructure.Node;

public class LinkedList<E> {
    private Node head;
    private Node last;
    private int count;

    public LinkedList() {
        count = 0;
    }

    public void add(E data) {

        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node currentNode = head;

        if (currentNode != null) {
            while(currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode.setNext(temp);
        }
        count++;
    }

    public Object get(int index) {
        if (index < 0) return null;

        Node currentNode = null;
        if (head != null) {
            currentNode = head.getNext();
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null) return null;

                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
        return currentNode;
    }

    public boolean remove(int index) {
        if (index < 1 || index > getCount()) return false;

        Node currentNode = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (currentNode.getNext() == null) return false;

                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
            count--;
            return true;
        }
        return false;
    }


    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        String output = "";

        if(head != null) {
            Node currentNode = head.getNext();
            while( currentNode != null) {
                output += "[" + currentNode.getData().toString() + "]";
                currentNode = currentNode.getNext();
            }
        }
        return output;
    }
}
