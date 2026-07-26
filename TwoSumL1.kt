object TwoSumL1 {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var seen = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val complement = target - nums[i]
            if (seen.containsKey(complement)) {
                return intArrayOf(seen[complement]!!, i)
            } else {
                seen[nums[i]] = i
            }
        }

        return intArrayOf() // Return an empty array if no solution is found
    }
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = TwoSumL1.twoSum(nums, target)
    println("Indices of the two numbers that add up to $target: ${result.joinToString(", ")}")
}