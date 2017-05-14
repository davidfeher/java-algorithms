package sorting;

public class SelectionSort {
    public static void Sort(int[] array) {
        int minValue;
        for(int i = 0; i<array.length; i++) {
            minValue = array[i];
            for (int j = i+1; j<array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    array[j] = array[i];
                    array[i] = minValue;
                }
            }
        }
    }
}
