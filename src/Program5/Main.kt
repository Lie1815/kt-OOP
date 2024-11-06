package Program5

import Program5.Person.Admin
import Program5.Person.Moderator
import Program5.Person.Person

fun main(){
    println("введите имя и роль пользователя: например: Moderator или Admin")
    val input = readLine()!!.split(" ")
    if (input.size != 2) {
        println("Ошибка: необходимо ввести имя и роль через пробел.")
        return
    }

    val (name, role) = input
    val person: Person? = when (role) {
        "Moderator" -> Moderator(name)
        "Admin" -> Admin(name)
        else -> {
            println("Ошибка: роль должна быть 'Moderator' или 'Admin'.")
            return
        }
    }

    person?.showInfo()

}