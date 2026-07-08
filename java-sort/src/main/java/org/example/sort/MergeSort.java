package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 归并排序
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    private static void merge(@NotNull int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void mergeSort(@NotNull int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }
}
