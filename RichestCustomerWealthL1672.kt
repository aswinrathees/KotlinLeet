object RichestCustomerWealthL1672 {
    
    fun getMaximumWealth(accounts: Array<IntArray>): Int {
        var maxWealth = 0

        for (account in accounts) {
            val wealth = account.sum()
            if (wealth > maxWealth) {
                maxWealth = wealth
            }
        }

        return maxWealth
    }
}

fun main() {
    val accounts = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(3, 2, 1)
    )
    print("Maximum wealth is: ${RichestCustomerWealthL1672.getMaximumWealth(accounts)}")
}