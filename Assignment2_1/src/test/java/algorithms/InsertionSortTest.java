package algorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InsertionSortTest {

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        InsertionSort.Metrics m = new InsertionSort.Metrics();
        InsertionSort.insertionSort(arr, m);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void testSingleElement() {
        int[] arr = {5};
        InsertionSort.Metrics m = new InsertionSort.Metrics();
        InsertionSort.insertionSort(arr, m);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4, 5};
        InsertionSort.Metrics m = new InsertionSort.Metrics();
        InsertionSort.insertionSort(arr, m);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testReverseOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        InsertionSort.Metrics m = new InsertionSort.Metrics();
        InsertionSort.insertionSort(arr, m);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }

    @Test
    public void testDuplicates() {
        int[] arr = {3, 1, 2, 3, 1};
        InsertionSort.Metrics m = new InsertionSort.Metrics();
        InsertionSort.insertionSort(arr, m);
        assertArrayEquals(new int[]{1, 1, 2, 3, 3}, arr);
    }
}
