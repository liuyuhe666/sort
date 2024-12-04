package gosort

func BucketSort(arr []int) {
	maxValue := GetArrayMaxValue(arr) + 1
	buckets := make([]int, maxValue)
	for _, v := range arr {
		buckets[v]++
	}
	for i, j := 0, 0; i < len(buckets); i++ {
		for buckets[i] > 0 {
			arr[j] = i
			j++
			buckets[i]--
		}
	}
}
