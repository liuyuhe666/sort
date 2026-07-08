export default function bubbleSort(arr: number[]): number[] {
  const n = arr.length
  let flag: boolean
  for (let i = 0; i < n; i++) {
    flag = false
    for (let j = 0; j < n - 1 - i; j++) {
      if (arr[j]! > arr[j + 1]!) {
        const temp = arr[j]!
        arr[j] = arr[j + 1]!
        arr[j + 1] = temp
        flag = true
      }
    }
    if (!flag) {
      break
    }
  }
  return arr
}
