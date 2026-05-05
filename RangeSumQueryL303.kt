class RangeSumQueryL303(nums: IntArray) {

    private var prefixSum: IntArray

    init {
        prefixSum = IntArray(nums.size)
        for (i in nums.indices) {
            prefixSum[i] = nums[i] + if (i > 0) prefixSum[i - 1] else 0
        }
    }

    fun sumRange(left: Int, right: Int): Int {
        return prefixSum[right] - if (left > 0) prefixSum[left - 1] else 0
    }
}

fun main() {
    val rangeSumQuery = RangeSumQueryL303(intArrayOf(-2,0,3,-5,2,-1))
    val result = rangeSumQuery.sumRange(0,2)
    print(result)
}