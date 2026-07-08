package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {53, 3, 542, 748, 14, 214, 154, 63, 616};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 基数排序
        radixSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    private static void radixSort(@NotNull int[] arr, int r) {
        int[] temp = new int[arr.length];
        int[] bucket = new int[10];
        for (int j : arr) {
            bucket[(j / r) % 10]++;
        }
        for (int i = 1; i < bucket.length; i++) {
            bucket[i] += bucket[i - 1];
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            temp[bucket[(arr[i] / r) % 10] - 1] = arr[i];
            bucket[(arr[i] / r) % 10]--;
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }

    private static int getMaxValue(@NotNull int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result) {
                result = arr[i];
            }
        }
        return result;
    }

    public static void radixSort(@NotNull int[] arr) {
        int maxValue = getMaxValue(arr);
        for (int r = 1; maxValue / r > 0; r *= 10) {
            radixSort(arr, r);
        }
    }
}
