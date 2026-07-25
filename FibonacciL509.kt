object FibonacciL509 {

    fun getFibonacci(num: Int): Int {
        if (num <= 1) {
            return num
        }
        var a = 0
        var b = 1
        var c = 0
        for (i in 2..num) {
            c = a + b
            a = b
            b = c
        }
        return c
    }
}

fun main() {
    val num = 10
    print("Fibonacci number at position $num: ${FibonacciL509.getFibonacci(num)}")
}