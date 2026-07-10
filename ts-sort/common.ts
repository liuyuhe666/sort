export function createRandomArray(length: number, min: number, max: number): number[] {
  return Array.from(
    { length },
    () => Math.floor(Math.random() * (max - min + 1)) + min,
  )
}

export function getMaxValueFromArray(arr: number[]): number {
  let result = arr[0]!
  for (let i = 1; i < arr.length; i++) {
    if (arr[i]! > result) {
      result = arr[i]!
    }
  }
  return result
}
