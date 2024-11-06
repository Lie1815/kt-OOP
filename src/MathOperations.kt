import java.lang.IllegalArgumentException

class MathOperations {

    fun add(a: Int, b: Int): Double{
        return (a + b).toDouble()
    }
    fun subtract(a: Int, b:Int): Double{
        return (a - b).toDouble()
    }
    fun multiply(a: Int, b: Int): Double{
        return (a * b).toDouble()
    }

    fun divide(a: Int, b: Int): Double{
        return if (b != 0){
            a.toDouble()/b
        }else{
            throw IllegalArgumentException("Деление на 0")
        }
    }

    fun add(a: Double, b: Double):Double {
        return a + b
    }
    fun subtract(a: Double, b: Double): Double{
        return a - b
    }

    fun multiply(a: Double, b: Double): Double{
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        return if(b != 0.0) {
            a/b
        }else {
            throw IllegalArgumentException("деление на 0")
        }
    }
}
fun main() {
    println("введите тип данных: Int или Double")
    val type = readLine()!!.trim()
    println("введите оператор: add, subtract, multiply, divide")
    val operation = readLine()!!.trim()
    println("введите первое число ")
    val num = readLine()!!.trim()
    println("введите второе число")
    val num0 = readLine()!!.trim()

    val mathOperations = MathOperations()
    var result: Double = 0.0

    when (type) {
        "Int" -> {
            val num1 = num.toInt()
            val num2 = num0.toInt()

            result = when (operation) {
                "add" -> mathOperations.add(num1, num2)
                "subtract" -> mathOperations.subtract(num1, num2)
                "multiply" -> mathOperations.multiply(num1, num2)
                "divide" -> mathOperations.divide(num1, num2)
                else -> throw IllegalArgumentException("ошибка: неправильный оператор")
            }
        }
        "Double" -> {
            val num1 = num.toDouble()
            val num2 = num0.toDouble()

            result = when (operation) {
                "add" -> mathOperations.add(num1, num2)
                "subtract" -> mathOperations.subtract(num1, num2)
                "multiply" -> mathOperations.multiply(num1, num2)
                "divide" -> mathOperations.divide(num1, num2)
                else -> throw IllegalArgumentException("ошибка: неправильный оператор")
            }
        }
        else -> throw IllegalArgumentException("ошибка: неправильный тип данных")
    }

    println("Result: $result")
}