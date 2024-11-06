package Playable


class Guitar : Playable {
    override fun play() {
        println("Играет гитара")
    }
}

fun main() {

    println("введите команду, напиример play")
    val command = readLine()!!.trim()

    if (command == "play") {

        val guitar = Guitar()

        guitar.play()
    } else {
        println("Неизвестная команда")
    }
}
