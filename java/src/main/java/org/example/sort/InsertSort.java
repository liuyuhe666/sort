package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 插入排序
        insertSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(@NotNull int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
