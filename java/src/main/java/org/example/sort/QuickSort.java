package org.example.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 快速排序
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = arr[left];
            int i = left;
            int j = right;
            while (i < j) {
                // 从右向左找小于基准的元素
                while (i < j && arr[j] >= pivot) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                }
                // 从左向右找大于基准的元素
                while (i < j && arr[i] <= pivot) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                }
            }
            arr[i] = pivot;
            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }
}
