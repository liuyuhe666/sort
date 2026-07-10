export default function shellSort(arr: number[]) {
  const n = arr.length
  for (let gap = Math.trunc(n / 2); gap > 0; gap = Math.trunc(gap / 2)) {
    for (let i = 0; i < gap; i++) {
      for (let j = i + gap; j < n; j += gap) {
        if (arr[j]! < arr[j - gap]!) {
          const temp = arr[j]!
          let k = j - gap
          while (k >= 0 && arr[k]! > temp) {
            arr[k + gap] = arr[k]!
            k -= gap
          }
          arr[k + gap] = temp
        }
      }
    }
  }
}
