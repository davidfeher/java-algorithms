package sorting;

public class MergeSort {

    private int[] array;
    private int[] tempArray;

    public void sort(int[] array) {
        this.array = array;
        this.tempArray = new int[array.length];
        mergeSort(0, array.length -1);
    }

    private void mergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {

            int center = lowerIndex + (higherIndex-lowerIndex) / 2;
            mergeSort(lowerIndex, center);
            mergeSort(center+1, higherIndex);

            merge(lowerIndex, center, higherIndex);
        }
    }

    private void merge(int lowerIndex, int center, int higherIndex) {

        System.arraycopy(array, lowerIndex, tempArray, lowerIndex, higherIndex + 1 - lowerIndex);
        int i = lowerIndex;
        int j = center + 1;
        int k = lowerIndex;
        while (i <= center && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= center) {
            array[k] = tempArray[i];
            k++;
            i++;
        }

    }
}
