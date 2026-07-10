export default function insertSort(arr: number[]) {
  const n = arr.length
  for (let i = 1; i < n; i++) {
    for (let j = i; j > 0; j--) {
      if (arr[j]! < arr[j - 1]!) {
        const temp = arr[j]!
        arr[j] = arr[j - 1]!
        arr[j - 1] = temp
      }
    }
  }
}
