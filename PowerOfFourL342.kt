object PowerOfFourL342 {

    fun isPowerOfFour(num: Int): Boolean {
        if (num < 4) return false

        var number = num

        while (number % 4 == 0) {
            number = number / 4
        }

        return number == 1
    }
}

fun main() {
    print("Is power of Four: ${PowerOfFourL342.isPowerOfFour(16)}")
}