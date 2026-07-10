import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import heapSort from './heapSort'

test('heapSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const heapSortResult = [...arr]
  heapSort(heapSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(heapSortResult).toEqual(sortResult)
})
