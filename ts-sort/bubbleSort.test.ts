import { expect, test } from 'bun:test'
import bubbleSort from './bubbleSort'
import { createRandomIntArray } from './common'

test('bubbleSort', () => {
  const arr = createRandomIntArray(10000, 1, 1000)
  const bubbleSortResult = bubbleSort([...arr])
  const sortResult = [...arr].sort((a, b) => a - b)
  expect(bubbleSortResult).toEqual(sortResult)
})
