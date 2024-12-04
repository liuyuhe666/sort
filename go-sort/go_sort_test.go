package gosort

import (
	"math/rand"
	"reflect"
	"sort"
	"testing"
	"time"
)

const n = 10000

func generateArray(size int) []int {
	arr := make([]int, size)
	r := rand.New(rand.NewSource(time.Now().UnixNano()))
	for i := 0; i < size; i++ {
		arr[i] = r.Int()
	}
	return arr
}

func generateArrayWithMaxValue(size int, maxValue int) []int {
	arr := make([]int, size)
	r := rand.New(rand.NewSource(time.Now().UnixNano()))
	for i := 0; i < size; i++ {
		arr[i] = r.Intn(maxValue + 1)
	}
	return arr
}

func initArray(size int) (arr1, arr2 []int) {
	arr := generateArray(size)
	arr1 = make([]int, size)
	arr2 = make([]int, size)
	copy(arr1, arr)
	copy(arr2, arr)
	sort.Ints(arr1)
	return arr1, arr2
}

func TestBubbleSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	BubbleSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestBubbleSort: arr1 != arr2")
	}
}

func TestQuickSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	QuickSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestQuickSort: arr1 != arr2")
	}
}

func TestInsertSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	InsertSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestInsertSort: arr1 != arr2")
	}
}

func TestShellSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	ShellSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestShellSort: arr1 != arr2")
	}
}

func TestSelectSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	SelectSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestSelectSort: arr1 != arr2")
	}
}

func TestBucketSort(t *testing.T) {
	arr := generateArrayWithMaxValue(n, 100)
	arr1 := make([]int, n)
	arr2 := make([]int, n)
	copy(arr1, arr)
	copy(arr2, arr)
	sort.Ints(arr1)
	BucketSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestBucketSort: arr1 != arr2")
	}
}

func TestRadixSort(t *testing.T) {
	arr := generateArrayWithMaxValue(n, 100)
	arr1 := make([]int, n)
	arr2 := make([]int, n)
	copy(arr1, arr)
	copy(arr2, arr)
	sort.Ints(arr1)
	RadixSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestRadixSort: arr1 != arr2")
	}
}

func TestMergeSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	MergeSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestMergeSort: arr1 != arr2")
	}
}

func TestHeapSort(t *testing.T) {
	arr1, arr2 := initArray(n)
	HeapSort(arr2)
	if !reflect.DeepEqual(arr1, arr2) {
		t.Errorf("TestHeapSort: arr1 != arr2")
	}
}
