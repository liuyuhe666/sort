import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import insertSort from './insertSort'

test('insertSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const insertSortResult = [...arr]
  insertSort(insertSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(insertSortResult).toEqual(sortResult)
})
