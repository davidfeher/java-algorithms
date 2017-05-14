package sorting;


public class BubbleSort {

    public static void Sort(int[] array) {
        for (int a : array) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    Swap(array, j - 1, j);
                }
            }
        }
    }

    private static void Swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
