import { expect, test } from 'bun:test'
import { createRandomArray } from './common'
import shellSort from './shellSort'

test('shellSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const shellSortResult = [...arr]
  shellSort(shellSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(shellSortResult).toEqual(sortResult)
})
