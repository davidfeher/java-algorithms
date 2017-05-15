package sorting;

public class QuickSort {
    public static void quickSort(int[] array) {
        quickSort(array, 0 ,array.length-1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = array[left + (right-left)/2];
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index-1);
        quickSort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }

            while (array[right] > pivot) {
                right--;
            }

            if (left <= right) {
                Swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void Swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }
}
