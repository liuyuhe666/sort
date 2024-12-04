package gosort

func GetArrayMaxValue(arr []int) int {
	result := arr[0]
	for i := 1; i < len(arr); i++ {
		if arr[i] > result {
			result = arr[i]
		}
	}
	return result
}
