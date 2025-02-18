

//Дополнительное Задание
//1) Найти количество цифр в заданном числе n., например, число 1 содержит 1
//цифру, 456 -- 3 цифры, 65536 -- 5 цифр. Использовать операции со строками в этой
//задаче запрещается.
//2) Создайте программу, выводящую на экран первые 20 элементов
//последовательности 2 4 8 16 32 64 128


fun countDigits(n: Int): Int {
    var number = n
    var count = 0
    while (number != 0) {
        number /= 10
        count++
    }
    return count
}

fun main() {
    println(countDigits(1)) // 1
    println(countDigits(456)) // 3
    println(countDigits(65536)) // 5

//   Дополнительное Задание
//            1) Вводятся координаты (x;y) точки и радиус круга (r). Определить
//    принадлежит ли данная точка кругу, если его центр находится в начале
//    координат. Сделать используя оператор when.

//    fun isPointInCircle(x: Double, y: Double, r: Double): Boolean {
//        return when {
//            (x * x + y * y) <= (r * r) -> true
//            else -> false
//        }
//    }
//
//    // Колдонуучунун киргизүүсүн кабыл алуу
//    print("Чекиттин x координатасын киргизиңиз:")
//    val x = readLine()?.toDoubleOrNull() ?: 0.0
//
//    print("Чекиттин y координатасын киргизиңиз:")
//    val y = readLine()?.toDoubleOrNull() ?: 0.0
//
//    print("Тегеректин радиусун киргизиңиз:")
//    val r = readLine()?.toDoubleOrNull() ?: 0.0
//
//    // Функцияны чакыруу жана натыйжаны чыгаруу
//    val result = isPointInCircle(x, y, r)
//    if (result) {
//        println("Чекит ($x, $y) тегерекке таандык.")
//    } else {
//        println("Чекит ($x, $y) тегерекке таандык эмес.")
//    }


//    2) Дан номер месяца (от 1 до 12 включительно). Вернуть число дней в этом месяце
//    по календарю. Сделать используя оператор when.

//    fun isLeapYear(year: Int): Boolean {
//        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
//    }
//
//    fun getDaysInMonth(month: Int, year: Int): Int {
//        return when (month) {
//            1, 3, 5, 7, 8, 10, 12 -> 31
//            4, 6, 9, 11 -> 30
//            2 -> if (isLeapYear(year)) 29 else 28
//            else -> throw IllegalArgumentException("Айдын номуру туура эмес")
//        }
//    }
//    val daysInMonth = getDaysInMonth(2, 2024)
//    println(daysInMonth)
//    Массивы
//    Дополнительное Задание
//    1) Дан массив чисел “5, -3, 15, 61, 29, 10, -2 ,7” найти наибольший элемент в этом массиве.

//    val array1 = intArrayOf(1, 2, 3)
//    val array2 = intArrayOf(4, 5, 6)
//
//    val sumArray = array1.zip(array2) { a, b -> a + b }
//    println(sumArray)
//
//
//    val array = intArrayOf(5, -3, 15, 61, 29, 10, -2, 7)
//
//    val maxElement = array.maxOrNull()
//    println("Наибольший элемент: $maxElement")

}