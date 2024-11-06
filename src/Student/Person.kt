package Student

open class Person {
    private var name: String = ""

    fun setName(newName: String){
        name = newName
    }

    fun printName() {
        println("Name: $name")
    }
    protected fun getName(): String {
        return name
    }
}

fun main(){
    println("введите количество людей: ")
    val n = readLine()!!.toInt()

    println("введите имена, каждое на новой строке ")

    for(i in 1..n){
        val name =  readLine()!!.trim()
        val person = Person()
        person.setName(name)

        person.printName()
    }
}