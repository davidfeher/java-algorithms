package datastructure.stack.StackImpl;

import datastructure.stack.Stack;

public class StackArray implements Stack {
    private int[] stack;
    private int topIndex;

    public StackArray(int size) {
        stack = new int[size];
        topIndex = 0;
    }

    @Override
    public void push(int data) {
        stack[topIndex++] = data;
    }

    @Override
    public boolean pop() {
        if (topIndex <= 0) {
            System.out.println("You can't remove items when there is none!");
            return false;
        }

        stack[--topIndex] = 0;
        return true;
    }

    @Override
    public int peek() {
        return stack[topIndex];
    }

    @Override
    public int count() {
        return topIndex + 1;
    }

    @Override
    public String toString() {
        String output = "";
        for (int i : stack) {
            output += "[" + String.valueOf(i) +"]";
        }
        return output;
    }
}
