package gosort

func QuickSort(arr []int) {
	quickSort(arr, 0, len(arr)-1)
}

func quickSort(arr []int, left, right int) {
	if left < right {
		pivot := arr[left]
		i, j := left, right
		for i < j {
			for i < j && arr[j] >= pivot {
				j--
			}
			if i < j {
				arr[i] = arr[j]
			}
			for i < j && arr[i] <= pivot {
				i++
			}
			if i < j {
				arr[j] = arr[i]
			}
		}
		arr[i] = pivot
		quickSort(arr, left, i-1)
		quickSort(arr, i+1, right)
	}
}
