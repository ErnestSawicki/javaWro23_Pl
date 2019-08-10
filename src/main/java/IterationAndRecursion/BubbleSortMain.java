package IterationAndRecursion;

public class BubbleSortMain {
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,1,7};
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length -1] + "}");
        System.out.println();

        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(arr);
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length -1] + "}");
        System.out.println();
    }
}
