fun main() {
    val a = 2
    val b = 11

    val (min, max) = if (a < b) a to b else b to a
    println("Введенные числа: $a и $b")

    val array = (min..max).toList().toIntArray()
    println("Массив: ${array.joinToString(", ")}")
}