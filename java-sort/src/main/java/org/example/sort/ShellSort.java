package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 希尔排序
        shellSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(@NotNull int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = 0; i < gap; i++) {
                for (int j = i + gap; j < n; j += gap) {
                    if (arr[j] < arr[j - gap]) {
                        int temp = arr[j];
                        int k = j - gap;
                        while (k >= 0 && arr[k] > temp) {
                            arr[k + gap] = arr[k];
                            k -= gap;
                        }
                        arr[k + gap] = temp;
                    }
                }
            }
        }
    }
}
