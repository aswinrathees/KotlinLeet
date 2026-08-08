object ThirdMaxL414 {

    fun getThirdMax(nums: IntArray): Int {
        var sortedNums = nums.toSet().toIntArray()
        sortedNums.sortDescending()

        return if (sortedNums.size < 3) {
            sortedNums[0]
        } else {
            sortedNums[2]
        }
    }
}

fun main() {
    val nums = intArrayOf(3, 2, 1)
    print("Third maximum number is: ${ThirdMaxL414.getThirdMax(nums)}")
}