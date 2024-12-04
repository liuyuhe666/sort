package gosort

func SelectSort(arr []int) {
	for i := 0; i < len(arr)-1; i++ {
		index := i
		for j := i + 1; j < len(arr); j++ {
			if arr[index] > arr[j] {
				index = j
			}
		}
		if index != i {
			arr[index], arr[i] = arr[i], arr[index]
		}
	}
}
