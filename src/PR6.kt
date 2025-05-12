fun main() {
    val array = intArrayOf(5, 8, 18, 34, 3, 56, 43, 27, 4, 23)

    val average = array.average()
    println("Среднее арифметическое: $average")

    val aboveAverage = array.filter { it > average }
    println("Элементы выше среднего: ${aboveAverage.joinToString(", ")}")
}