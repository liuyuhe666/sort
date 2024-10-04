package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 堆排序
        heapSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void heapSort(@NotNull int[] arr) {
        int len = arr.length;
        // 建立最大堆
        buildMaxHeap(arr, len);
        for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
    }

    private static void buildMaxHeap(@NotNull int[] arr, int len) {
        for (int i = (int) (double) (len / 2); i >= 0; i--) {
            heapify(arr, i, len);
        }
    }

    private static void heapify(@NotNull int[] arr, int i, int len) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < len && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < len && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            swap(arr, i, largest);
            heapify(arr, largest, len);
        }
    }

    private static void swap(@NotNull int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
