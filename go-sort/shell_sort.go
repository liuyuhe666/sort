package gosort

func ShellSort(arr []int) {
	n := len(arr)
	for gap := n / 2; gap > 0; gap = gap / 2 {
		for i := 0; i < gap; i++ {
			for j := i + gap; j < n; j += gap {
				if arr[j] < arr[j-gap] {
					temp := arr[j]
					k := j - gap
					for k >= 0 && arr[k] > temp {
						arr[k+gap] = arr[k]
						k -= gap
					}
					arr[k+gap] = temp
				}
			}
		}
	}
}
