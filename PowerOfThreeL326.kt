object PowerOfThreeL326 {

    fun isPowerOfThree(num: Int): Boolean {
        var number = num

        while (number % 3 == 0) {
            number = number / 3
        }

        return number == 1
    }
}

fun main() {
    print("Is power of Three: ${PowerOfThreeL326.isPowerOfThree(9)}")
}