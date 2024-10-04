package org.example.sort;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

public class SortTest {
    @Test
    public void testBucketSort() {
        int n = 1000;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(10);
        }
        int[] arr1 = arr.clone();
        Arrays.sort(arr);
        BucketSort.bucketSort(arr1, 10);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void testRadixSort() {
        int n = 100;
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }
        int[] arr1 = arr.clone();
        Arrays.sort(arr);
        RadixSort.radixSort(arr1);
        assertArrayEquals(arr, arr1);
    }

    @Test
    public void test() {
        int n = 1000;
        int[] arr = new int[n];
        // 随机生成 n 个整数
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt();
        }
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);
        // 测试冒泡排序
        int[] arr2 = arr.clone();
        BubbleSort.bubbleSort(arr2);
        assertArrayEquals(arr1, arr2);
        // 测试快速排序
        int[] arr3 = arr.clone();
        QuickSort.quickSort(arr3, 0, arr3.length - 1);
        assertArrayEquals(arr1, arr3);
        // 测试插入排序
        int[] arr4 = arr.clone();
        InsertSort.insertSort(arr4);
        assertArrayEquals(arr1, arr4);
        // 测试希尔排序
        int[] arr5 = arr.clone();
        InsertSort.insertSort(arr5);
        assertArrayEquals(arr1, arr5);
        // 测试选择排序
        int[] arr6 = arr.clone();
        InsertSort.insertSort(arr6);
        assertArrayEquals(arr1, arr6);
        // 测试归并排序
        int[] arr7 = arr.clone();
        MergeSort.mergeSort(arr7, 0, arr7.length - 1);
        assertArrayEquals(arr1, arr7);
        // 测试堆排序
        int[] arr8 = arr.clone();
        HeapSort.heapSort(arr8);
        assertArrayEquals(arr1, arr8);
    }
}
