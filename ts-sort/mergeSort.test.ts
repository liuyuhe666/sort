import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import mergeSort from './mergeSort'

test('mergeSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const mergeSortResult = [...arr]
  mergeSort(mergeSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(mergeSortResult).toEqual(sortResult)
})
