package Student

import Student.Person


class Student : Person() {
    private var studentId: Int = 0

    fun setStudentId(newId: Int) {
        studentId = newId
    }


    fun printStudentDetails() {
        println("Name: ${getName()}, Student ID: $studentId")
    }
}


fun main() {
    println("введите количество студентов: ")
    val n = readLine()!!.toInt()

    for (i in 1..n) {

        println("введите имя студента и его ID : ")
        val input = readLine()!!.split(" ")

        val name = input[0]
        val studentId = input[1].toInt()


        val student = Student()
        student.setName(name)
        student.setStudentId(studentId)


        student.printStudentDetails()
    }
}