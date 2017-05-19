import com.sun.org.apache.xpath.internal.SourceTree;
import datastructure.Node;
import datastructure.linkedlist.LinkedList;
import datastructure.stack.Stack;
import datastructure.stack.StackImpl.StackArray;
import datastructure.stack.StackImpl.StackLinkedList;
import sorting.BubbleSort;
import sorting.MergeSort;
import sorting.QuickSort;
import sorting.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 4, 11, 3, 2, 1, 0, 19, 5};
        MergeSort sorter = new MergeSort();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{10, 9, 4, 11, 3, 2, 1, 0, 19, 5};
        QuickSort.quickSort(array);
        System.out.println(Arrays.toString(array));

        array = new int[]{10, 9, 4, 11, 3, 2, 1, 0, 19, 5};
        BubbleSort.Sort(array);
        System.out.println(Arrays.toString(array));

        LinkedList myList = new LinkedList();
        myList.add(3);
        myList.add(5);

        System.out.println(myList.toString());

        System.out.println(myList.get(0));

        Stack stack = new StackArray(10);
        stack.pop();
        stack.push(12);
        stack.push(1);
        stack.push(7);
        stack.pop();

        System.out.println(stack);

        StackLinkedList stackLinkedList = new StackLinkedList();
        System.out.println(stackLinkedList.peek());

        stackLinkedList.push(10);
        stackLinkedList.push(5);
        System.out.println(stackLinkedList.peek());
        stackLinkedList.pop();
        System.out.println(stackLinkedList.peek());

        System.out.println(stackLinkedList.numberOfElements());
        }
    }
