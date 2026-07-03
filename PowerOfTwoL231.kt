object PowerOfTwoL231 {

    fun isPowerOfTwo(num: Int): Boolean {
        if (num < 2) return false

        var number = num
        while (number % 2 == 0) {
            number = number / 2
        }

        return number == 1
    }
}

fun main() {
    print("Is Power of Two: ${PowerOfTwoL231.isPowerOfTwo(16)}")
}