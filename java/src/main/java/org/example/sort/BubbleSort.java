package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 40, 30, 10, 60, 50};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 冒泡排序
        bubbleSort(arr);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(@NotNull int[] arr) {
        int n = arr.length; // 数组长度
        boolean flag; // 标记
        for (int i = 0; i < n - 1; i++) {
            flag = false;
            for (int j = 0; j < n - i - 1; j++) {
                // 前者大于后者，交换位置
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // 发生了交换，则设置标记为 true
                }
            }
            if (!flag) {
                // 如果没有发生交换，则说明数组已经有序
                break;
            }
        }
    }
}
