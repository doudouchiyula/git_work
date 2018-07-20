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
    println("index1=$mutableListOf[2]")


}
