package algorithms;

public class InsertionSort {

    public static class Metrics {
        public long comparisons = 0;
        public long swaps = 0;
    }

    public static void insertionSort(int[] arr, Metrics m) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                m.comparisons++;
                arr[j + 1] = arr[j];
                j--;
                m.swaps++;
            }
            if (j >= 0) m.comparisons++;
            arr[j + 1] = key;
        }
    }
}
