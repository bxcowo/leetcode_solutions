class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices){
            for (j in i + 1 ..< nums.size){
                return if (nums[i] + nums[j] == target) intArrayOf(i, j) else continue
            }
        }
        throw IllegalArgumentException("No solution found")
    }
}