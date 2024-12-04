package gosort

func MergeSort(arr []int) {
	mergeSort(arr, 0, len(arr)-1)
}

func mergeSort(arr []int, l, r int) {
	if l < r {
		mid := (l + r) / 2
		mergeSort(arr, l, mid)
		mergeSort(arr, mid+1, r)
		merge(arr, l, mid, r)
	}
}

func merge(arr []int, l, mid, r int) {
	temp := make([]int, r-l+1)
	i, j, k := l, mid+1, 0
	for i <= mid && j <= r {
		if arr[i] <= arr[j] {
			temp[k] = arr[i]
			i++
		} else {
			temp[k] = arr[j]
			j++
		}
		k++
	}
	for i <= mid {
		temp[k] = arr[i]
		k++
		i++
	}
	for j <= r {
		temp[k] = arr[j]
		k++
		j++
	}
	copy(arr[l:r+1], temp)
}
