import com.sun.org.apache.xpath.internal.SourceTree;
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
        }
    }
