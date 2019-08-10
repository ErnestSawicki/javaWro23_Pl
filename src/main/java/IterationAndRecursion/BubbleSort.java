package IterationAndRecursion;

public class BubbleSort {

    public int[] bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (isSorted == false) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = tmp;
                    isSorted = false;
                }
            }
        }

        return arr;
    }
}
