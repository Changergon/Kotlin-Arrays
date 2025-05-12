fun main() {
    val array = intArrayOf(24, -63, 67, -12, 88, 94, -28, 82, 0, 53)

    val min = array.minOrNull() ?: 0
    val max = array.maxOrNull() ?: 0

    println("Минимальный элемент: $min")
    println("Максимальный элемент: $max")
}