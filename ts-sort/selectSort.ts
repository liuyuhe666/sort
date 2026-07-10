export default function selectSort(arr: number[]) {
  const n = arr.length
  for (let i = 0; i < n; i++) {
    let index = i
    for (let j = i + 1; j < n; j++) {
      if (arr[index]! > arr[j]!) {
        index = j
      }
    }
    if (index !== i) {
      const temp = arr[i]!
      arr[i] = arr[index]!
      arr[index] = temp
    }
  }
}
