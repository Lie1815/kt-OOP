package Program7

class Car (val brand: String, val year: Int) {
    open fun printDetails(){
        println("марка: $brand, год выпуска: $year")
    }
}

fun main(){
    println("введите количество автомобилей: ")
    val n = readLine()!!.toInt()

    println("введите марку и год выпуска автомобиля: ")
    val cars = mutableListOf<Car>()
    for (i in 0 until n ){
        val inpud = readLine()!!
        val parts = inpud.split(" ")

        val brand = parts[0]
        val year = parts[1].toInt()

        cars.add(Car(brand, year))
    }

    for(car in cars){
        car.printDetails()
    }

}