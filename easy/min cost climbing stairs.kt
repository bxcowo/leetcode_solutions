package easy

import kotlin.math.min

fun minCostClimbingStairs(cost: IntArray): Int {
    return when(val n = cost.size) {
        0 -> 0
        1 -> cost[0]
        2 -> min(cost[0], cost[1])
        else -> {
            val results: IntArray = IntArray(cost.size)
            results[0] = cost[0]
            results[1] = cost[1]
            for (i in 2 ..< cost.size){
                results[i] = min(results[i - 1], results[i - 2]) + cost[i]
            }
            min(results[n - 1], results[n - 2])
        }
    }
}