export default function mergeSort(arr: number[]) {
  _mergeSort(arr, 0, arr.length - 1)
}

function _mergeSort(arr: number[], l: number, r: number) {
  if (l < r) {
    const mid = Math.trunc((l + r) / 2)
    _mergeSort(arr, l, mid)
    _mergeSort(arr, mid + 1, r)
    merge(arr, l, mid, r)
  }
}

function merge(arr: number[], l: number, mid: number, r: number) {
  const temp = Array.from<number>({ length: r - l + 1 }).fill(0)
  let i = l
  let j = mid + 1
  let k = 0
  while (i <= mid && j <= r) {
    if (arr[i]! <= arr[j]!) {
      temp[k] = arr[i]!
      i++
    }
    else {
      temp[k] = arr[j]!
      j++
    }
    k++
  }
  while (i <= mid) {
    temp[k] = arr[i]!
    k++
    i++
  }
  while (j <= r) {
    temp[k] = arr[j]!
    k++
    j++
  }
  for (let p = l; p <= r; p++) {
    arr[p] = temp[p - l]!
  }
}
