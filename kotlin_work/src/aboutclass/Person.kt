package aboutclass

data class Person(var name: String) {
    constructor(name: String, gender: String) : this(name) {
        println(gender)
    }

    var age: Int = 0

}