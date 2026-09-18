// Task 15.2.2: Student subclass, showing invocation of constructor

class Student(name: String, val degree: String): Person(name) {
    init {
        println("Student constructor invoked")
    }
}
