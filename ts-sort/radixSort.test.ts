import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import radixSort from './radixSort'

test('radixSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const radixSortResult = [...arr]
  radixSort(radixSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(radixSortResult).toEqual(sortResult)
})
