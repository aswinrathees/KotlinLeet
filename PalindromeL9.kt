object PalindromeL9 {

    fun isPalindrome(num: Int): Boolean {
        if (num < 0) return false

        var originalNum = num
        var reversedNum = 0

        while (originalNum != 0) {
            val digit = originalNum % 10
            reversedNum = reversedNum * 10 + digit
            originalNum /= 10
        }

        return num == reversedNum
    }
}

fun main() {
    print("Is Palindrome: ${PalindromeL9.isPalindrome(121)}")
}