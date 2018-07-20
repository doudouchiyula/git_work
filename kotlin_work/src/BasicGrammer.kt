var string: String? = null

fun main(args: Array<String>) {
    val sum1 = sum1(2, 6);
    println(sum1)
    var sum2 = sum2(4, 8)
    println("sum2= $sum2")
    sum2 += sum2
    println("sum2===" + sum2)
    println("${sum3(12, 88)}")
    println(string?.length ?: -2)
//    println(string!!.length)
//    println(string!!.toInt())
    var x = parseInt("ii")?:9
    var y = parseInt(2)?:9
    println(x*y)
}

fun sum1(a: Int, b: Int): Int {
    return a + b

}

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int {
    return a + b
}

public fun sum4(a: Int, b: Int): Int = a + b

fun parseInt(obj: Any): Int ?{
    if(obj is String) return obj.length
    return null
}
