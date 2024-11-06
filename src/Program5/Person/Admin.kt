package Program5.Person

class Admin (name: String) : Person(name, "Admin") {
    override fun showInfo() {
        println("Администратор: $name")
    }
}