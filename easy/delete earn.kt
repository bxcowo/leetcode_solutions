package easy

import kotlin.math.*

fun deleteAndEarn(nums: IntArray): Int {
    return when(val n: Int = nums.size) {
        0 -> 0
        1 -> nums[0]
        else -> {
            val foundMax: Int = nums.max()
            val upgradedArray: IntArray = IntArray(foundMax + 1) {0}

            for (i in nums.indices){
                upgradedArray[nums[i]] += nums[i]
            }

            when(val k: Int = upgradedArray.size) {
                1 -> upgradedArray[0]
                2 -> max(upgradedArray[0], upgradedArray[1])
                else -> {
                    val results: IntArray = IntArray(foundMax + 1)

                    results[1] = upgradedArray[1]
                    results[2] = upgradedArray[2]

                    for (i in 3..<results.size) {
                        results[i] = max(results[i - 3], results[i - 2]) + upgradedArray[i]
                    }

                    max(results[foundMax], results[foundMax - 1])
                }
            }
        }
    }
}