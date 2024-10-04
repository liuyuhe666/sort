package org.example.sort;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 1, 6, 5};
        System.out.println("排序前:");
        System.out.println(Arrays.toString(arr));
        // 桶排序
        bucketSort(arr, 10);
        System.out.println("排序后:");
        System.out.println(Arrays.toString(arr));
    }

    public static void bucketSort(@NotNull int[] arr, int maxN) {
        int[] bucket = new int[maxN];
        for (int k : arr) {
            bucket[k]++;
        }
        for (int i = 0, j = 0; i < maxN; i++) {
            while (bucket[i] > 0) {
                arr[j++] = i;
                bucket[i]--;
            }
        }
    }
}
