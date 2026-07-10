export default function heapSort(arr: number[]) {
  let n = arr.length
  buildMaxHeap(arr, n)
  for (let i = n - 1; i > 0; i--) {
    const temp = arr[0]!
    arr[0] = arr[i]!
    arr[i] = temp
    n--
    heapify(arr, 0, n)
  }
}

function buildMaxHeap(arr: number[], n: number) {
  for (let i = Math.trunc(n / 2); i >= 0; i--) {
    heapify(arr, i, n)
  }
}

function heapify(arr: number[], i: number, n: number) {
  const left = 2 * i + 1
  const right = 2 * i + 2
  let k = i
  if (left < n && arr[left]! > arr[k]!) {
    k = left
  }
  if (right < n && arr[right]! > arr[k]!) {
    k = right
  }
  if (k !== i) {
    const temp = arr[i]!
    arr[i] = arr[k]!
    arr[k] = temp
    heapify(arr, k, n)
  }
}
