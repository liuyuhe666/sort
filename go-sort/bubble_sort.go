package gosort

func BubbleSort(arr []int) {
	n := len(arr)
	var flag bool
	for i := 0; i < n; i++ {
		flag = false
		for j := 0; j < n-i-1; j++ {
			if arr[j] > arr[j+1] {
				arr[j], arr[j+1] = arr[j+1], arr[j]
				flag = true
			}
		}
		if !flag {
			break
		}
	}
}
