object NimGameL29 {

    fun canNimWin(num: Int) = num % 4 != 0
}

fun main() {
    print("Can win: ${NimGameL29.canNimWin(4)}")
}