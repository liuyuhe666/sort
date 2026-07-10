import { expect, test } from 'bun:test'
import bucketSort from './bucketSort'
import { createRandomArray } from './common'

test('bucketSort', () => {
  const arr = createRandomArray(10000, 1, 1000)
  const bucketSortResult = [...arr]
  bucketSort(bucketSortResult)
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(bucketSortResult).toEqual(sortResult)
})
