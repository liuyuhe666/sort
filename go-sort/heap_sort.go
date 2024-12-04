package gosort

func HeapSort(arr []int) {
	n := len(arr)
	buildMaxHeap(arr, n)
	for i := n - 1; i > 0; i-- {
		arr[0], arr[i] = arr[i], arr[0]
		n--
		heapify(arr, 0, n)
	}

}

func buildMaxHeap(arr []int, n int) {
	for i := n / 2; i >= 0; i-- {
		heapify(arr, i, n)
	}
}

func heapify(arr []int, i, n int) {
	left, right := 2*i+1, 2*i+2
	k := i
	if left < n && arr[left] > arr[k] {
		k = left
	}
	if right < n && arr[right] > arr[k] {
		k = right
	}
	if k != i {
		arr[i], arr[k] = arr[k], arr[i]
		heapify(arr, k, n)
	}
}
