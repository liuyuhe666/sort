import { consola } from 'consola'
import { createRandomArray } from './common'
import mergeSort from './mergeSort'

const arr = createRandomArray(10, 1, 1000)
const mergeSortResult = [...arr]
mergeSort(mergeSortResult)
const sortResult = [...arr].sort((a, b) => a - b)
consola.log(arr)
consola.log(mergeSortResult)
consola.log(sortResult)
