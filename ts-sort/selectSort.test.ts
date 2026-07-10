import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import selectSort from './selectSort'

test('selectSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const selectSortResult = [...arr]
  selectSort(selectSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(selectSortResult).toEqual(sortResult)
})
