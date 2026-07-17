object MissingNumberL268 {

    fun getMissingNumber(nums: IntArray): Int {
        val numsCount = nums.size
        val sortedNums = nums.sortedArray()
        for (i in 0 until numsCount) {
            if (sortedNums[i] != i) {
                return i
            }
        }
        return numsCount
    }
}

fun main() {
    val nums = intArrayOf(3, 0, 1)
    print("Missing number: ${MissingNumberL268.getMissingNumber(nums)}")
}