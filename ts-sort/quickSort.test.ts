import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import { quickSort } from './quickSort'

test('quickSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const quickSortResult = [...arr]
  quickSort(quickSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(quickSortResult).toEqual(sortResult)
})
