fun main() {
    val array = intArrayOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    val sortedArray = array.sorted()
    val secondMin = sortedArray[1]

    println("Второй минимальный элемент: $secondMin")
}