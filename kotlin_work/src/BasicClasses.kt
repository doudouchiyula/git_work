import aboutclass.Fruits
import aboutclass.Person
import aboutclass.School
import aboutclass.swap

fun main(args: Array<String>) {
    val school = School("lili", "luyisi55")

//    println(school.size)
    println(school.converToStr())
    println(school.covertTostr1())
    //双冒号的作用：把一个方法当做参数传给另一个方法，即调用方法作为参数
    println(school.covertToTest("test_", school::covertTostr1))

    println(school::size)//结果：var aboutclass.School.size: kotlin.String
    println(school.size)//结果：Lililuyisi55

    val mutableListOf = mutableListOf(1, 2, 6)
    mutableListOf.swap(1, 2)

    println("index1=$mutableListOf[1]")
    println("index2=$mutableListOf[2]")

    val lili1 = Person("lili")
    lili1.age = 10;

    val lili2 = Person("lili")
    lili2.age = 20
    println("lili1==" + lili1.age)
    println("lili2==" + lili2.age)
    println("：：：" + (lili1 == lili2))//true
    println("：：：" + (lili1 === lili2))//false

    val lucy = Person("lucy", "女")
    val copy = lucy.copy("lilei")
    println("copy==" + copy.name)

    println(School.grade().grade())
    println(school.clazz().clazz())

    val fruits = Fruits.valueOf("orige")
    println(fruits)
    for (value in Fruits.values()) {
        println(value)
    }

    fool()

}

fun fool() {
    var obj = object {
        var a: Int = 0
        var b: Int = 1
    }
    println(obj.a + obj.b)
}
