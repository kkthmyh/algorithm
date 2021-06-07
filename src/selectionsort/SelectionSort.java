package selectionsort;

import test.ArrayGenerator;
import test.SortingHelper;

/**
 * 选择排序
 * @author 26250
 */
public class SelectionSort {

    private SelectionSort(){}

    public static <T extends Comparable<T>>void sort(T[] data) {
        // 找出每一轮最小元素的索引
        for (int i = 0; i < data.length; i++) {
            int minIndex = i;
            for (int j = i; j < data.length; j++) {
                if (data[j].compareTo(data[minIndex]) <0) {
                    minIndex =j;
                }
            }
            // 交换当前区间第一个元素与最小元素
            swap(data,minIndex,i);
        }

    }

    /**
     * 交换元素
     * @param data
     * @param minIndex
     * @param i
     */
    private static<T> void swap(T[] data, int minIndex, int i) {
        T temp = data[minIndex];
        data[minIndex]=data[i];
        data[i] = temp;
    }


    public static void main(String[] args) {
        Integer[] data = {6, 4, 2, 3, 1, 5};
        SelectionSort.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }

        int[] dataSize = {10000, 100000};
        for(int n: dataSize){
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("SelectionSort", arr);
        }

    }
}
