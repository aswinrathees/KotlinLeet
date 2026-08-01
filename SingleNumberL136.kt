object SingleNumberL136 {

    fun getSingleNumber(nums: IntArray): Int {
        var result = 0

        for (num in nums) {
            result = result xor num
        }

        return result
    }
}

fun main() {
    val nums = intArrayOf(4, 1, 2, 1, 2)
    print("Single number is: ${SingleNumberL136.getSingleNumber(nums)}")
}