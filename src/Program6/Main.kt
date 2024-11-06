package Program6

import Program6.Animals.Animal
import Program6.Animals.Bird
import Program6.Animals.Cat
import Program6.Animals.Dog

fun main(){
    println("введите название животного. например: Dog, Cat, Bird ")
    val animalName = readLine()?.trim() ?: ""

    val animal: Animal? = when (animalName){
        "Dog" -> Dog()
        "Cat" -> Cat()
        "Bird" -> Bird()
        else -> null
    }
    if (animal != null){
        animal.sound()
    }else {
        println("неизвестное животное: $animalName")
    }
}