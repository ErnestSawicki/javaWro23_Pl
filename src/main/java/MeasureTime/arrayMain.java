package MeasureTime;

import Stopwatch.Stopwatch;

public class arrayMain {
    public static void main(String[] args) {
        Stopwatch watch = new Stopwatch();
        int[] firstArray = new int[100];
        System.out.println("Czas dodawania elementow pierwszej: " + countTimeForArray(firstArray, watch));
        int[] secondArray = new int[10000];
        System.out.println("Czas dodawania elementow drugiej tablicy: " + countTimeForArray(secondArray, watch));
        int[] thirdArray = new int[1000000];
        System.out.println("Czas dodawania elementow trzeciej tablicy: " + countTimeForArray(thirdArray, watch));
        int[] fourthArray = new int[100000000];
        System.out.println("Czas dodawania elementow czwartej tablicy: " + countTimeForArray(fourthArray, watch));

    }
    public static long countTimeForArray(int[] array, Stopwatch watch){
        watch.start();
        for (int j = 0; j < 100; j++){
            for (int i = 0; i < array.length; i++)
                array[i] += 2;
        }
        return watch.stop() / 100;
    }
}
