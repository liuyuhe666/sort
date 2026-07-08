export function quickSort(arr: number[]) {
  _quickSort(arr, 0, arr.length - 1)
}

function _quickSort(arr: number[], left: number, right: number) {
  if (left < right) {
    const pivot = arr[left]!
    let i = left
    let j = right
    for (; i < j;) {
      for (; i < j && arr[j]! >= pivot;) {
        j--
      }
      if (i < j) {
        arr[i] = arr[j]!
      }
      for (; i < j && arr[i]! <= pivot;) {
        i++
      }
      if (i < j) {
        arr[j] = arr[i]!
      }
    }
    arr[i] = pivot
    _quickSort(arr, left, i - 1)
    _quickSort(arr, i + 1, right)
  }
}
