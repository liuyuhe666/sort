package gosort

func RadixSort(arr []int) {
	maxValue := GetArrayMaxValue(arr)
	for r := 1; maxValue/r > 0; r *= 10 {
		radixSort(arr, r)
	}
}

func radixSort(arr []int, r int) {
	temp := make([]int, len(arr))
	buckets := make([]int, 10)
	for _, v := range arr {
		buckets[(v/r)%10]++
	}
	for i := 1; i < len(buckets); i++ {
		buckets[i] += buckets[i-1]
	}
	for i := len(arr) - 1; i >= 0; i-- {
		temp[buckets[(arr[i]/r)%10]-1] = arr[i]
		buckets[(arr[i]/r)%10]--
	}
	copy(arr, temp)
}
