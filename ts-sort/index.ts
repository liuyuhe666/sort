import { consola } from 'consola'
import bubbleSort from './bubbleSort'
import { createRandomIntArray } from './common'

const arr = createRandomIntArray(10, 1, 1000)
const bubbleSortResult = bubbleSort([...arr])
const sortResult = [...arr].sort((a, b) => a - b)
consola.log(arr)
consola.log(bubbleSortResult)
consola.log(sortResult)
