package insertionsot;

import test.ArrayGenerator;
import test.SortingHelper;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author 26250
 */
public class InsertionSort {

    private InsertionSort() {
    }

    public static <T extends Comparable<T>> void sort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j - 1 >= 0; j--) {
                if (data[j].compareTo(data[j - 1]) < 0) {
                    swap(data, j, j - 1);
                } else {
                    break;
                }
            }
        }

    }

    private static <T> void swap(T[] data, int j, int i) {
        T temp = data[j];
        data[j] = data[i];
        data[i] = temp;
    }

    public static void main(String[] args) {
//        Integer[] data = {6, 4, 2, 3, 1, 5, 9, 6, 5, 1};
//        InsertionSort.sort(data);
//
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(data[i] + " ");
//        }

        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            Integer[] arr2 = Arrays.copyOf(arr, arr.length);
            SortingHelper.sortTest("SelectionSort", arr);
            SortingHelper.sortTest("InsertionSort", arr2);
        }
    }

}
