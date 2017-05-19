package datastructure.stack.StackImpl;

import datastructure.Node;
import java.util.*;


public class StackLinkedList<E> {
    private java.util.LinkedList<E> stack;
    private int count;
    private E currentElement;

    public StackLinkedList() {
        stack = new LinkedList<E>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(E data) {
        stack.addLast(data);
    }

    public void pop() {
        stack.removeLast();
    }

    public E peek() {
        return stack.peekLast();
    }

    public String toString() {
        return stack.toString();
        }

    public int numberOfElements() {
        return stack.size();
    }
    }
