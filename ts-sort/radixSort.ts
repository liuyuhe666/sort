import { getMaxValueFromArray } from './common'

export default function radixSort(arr: number[]) {
  const maxValue = getMaxValueFromArray(arr)
  for (let r = 1; Math.trunc(maxValue / r) > 0; r *= 10) {
    _radixSort(arr, r)
  }
}

function _radixSort(arr: number[], r: number) {
  const temp = Array.from<number>({ length: arr.length }).fill(0)
  const buckets = Array.from<number>({ length: 10 }).fill(0)
  for (const v of arr) {
    const index = Math.trunc(v / r) % 10
    buckets[index]!++
  }
  for (let i = 1; i < buckets.length; i++) {
    buckets[i]! += buckets[i - 1]!
  }
  for (let i = arr.length - 1; i >= 0; i--) {
    const index = Math.trunc(arr[i]! / r) % 10
    temp[buckets[index]! - 1] = arr[i]!
    buckets[index]!--
  }
  for (let i = 0; i < arr.length; i++) {
    arr[i] = temp[i]!
  }
}
