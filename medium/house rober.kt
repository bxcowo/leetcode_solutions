package medium

import kotlin.math.*

fun rob(nums: IntArray): Int {
    return when(val n = nums.size){
	0 -> 0
	1 -> nums[0]
        2 -> max(nums[0], nums[1])
        3 -> max(nums[0] + nums[2], nums[1])
        else -> {
            val results: IntArray = IntArray(n)
            results[0] = nums[0]
            results[1] = nums[1]
            results[2] = nums[2] + nums[0]
            for (i in 3 ..< results.size){
                results[i] = max(results[i - 3], results[i - 2]) + nums[i]
            }
            max(results[n - 1], results[n - 2])
        }
    }
}