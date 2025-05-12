fun main() {
    val array = intArrayOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    val sortedArray = array.sorted()
    println("Отсортированный массив: ${sortedArray.joinToString(", ")}")
}