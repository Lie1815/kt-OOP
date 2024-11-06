package Program5.Person

class Moderator(name: String): Person(name, "Moderator") {
    override fun showInfo() {
        println("Модератор: $name")
    }
}