import { getMaxValueFromArray } from './common'

export default function bucketSort(arr: number[]) {
  const maxLength = getMaxValueFromArray(arr) + 1
  const buckets = Array.from<number>({ length: maxLength }).fill(0)
  for (const v of arr) {
    buckets[v]!++
  }
  let j = 0
  for (let i = 0; i < buckets.length; i++) {
    while (buckets[i]! > 0) {
      arr[j] = i
      j++
      buckets[i]!--
    }
  }
}
