import sorting.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 9, 4, 11, 3, 2, 1, 0, 19, 5};
        BubbleSort.Sort(array);
        System.out.println(Arrays.toString(array));
    }
}
