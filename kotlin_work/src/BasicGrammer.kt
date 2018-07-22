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

    var x = parseInt("ii") ?: 9
    var y = parseInt(2) ?: 9
    println(x * y)


    val map = mapOf(1 to "kotlin--", 2 to "hard to learn", "test_3" to "test_key", "test_4" to "test_value")
    println(map.mapValues { (key, value) -> "$key -> $value" })
    map.forEach { key, value -> println("$value") }
    map.forEach { _, value -> println("$value") }

    val map1 = mapOf("key" to "我是value")
    println(map1.mapValues { (key, value) -> "$key ->$value" })

    val maxOf1 = maxOf1(3, 8)
    println(maxOf1)
    val maxof2 = maxof2(4, 2)
    println(maxof2)

    testFor()
    println("----------------")
    println(descrip(3))
    println(descrip("hello"))
    println(descrip(3L))
    println(descrip("我爱北京天安门"))
    println("----------------")

    rangeCheck(3)
    rangeCheck("b")
    rangeCheck("d")

    println("----------------")
    numBox()
    println("----------------")
    labelReturn1()
    println("----------------")
    labelReturn2()
    println("----------------")
    labelReturn3()
    println("----------------")
    labelReturn4()
}

fun sum1(a: Int, b: Int): Int {
    return a + b

}

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int {
    return a + b
}

public fun sum4(a: Int, b: Int): Int = a + b

fun parseInt(obj: Any): Int? {
    if (obj is String) return obj.length
    return null
}

//获取两个int数的最大值,方式1
fun maxOf1(a: Int, b: Int): Int {
    if (a > b) return a
    return b
}

//获取两个int数的最大值,方式2
fun maxof2(a: Int, b: Int) = if (a > b) a else b

//循环
fun testFor() {
    val datas = listOf("first", 2, "third")
    for (data in datas) {
        println(data)
    }
    println("--------")
    for (index in datas.indices) {
        println("data at $index is ${datas[index]}")
    }

    var index = 0
    while (index < datas.size) {
        print(datas[index])
        index++
    }
}

//when的用法
fun descrip(obj: Any): String =
        when (obj) {
            1 -> "this is  a number,is 1"
            "hello" -> "this is a word means 你好"
            is Long -> "this is a long number"
            !is String -> "not string"
            else -> "unkown type"
        }

//range 范围 方法测试
fun rangeCheck(obj: Any) {
    val list = listOf("3", 4, "a", "b", "c")
//    println(list.lastIndex)//list.lastindex 代表最后一个索引
    if (obj in 0..list.lastIndex) {
        println("this paramter is  in list")
    } else {
        println("this paramter out of list")
    }

    if (list.size !in list.indices) {
        println("list.size out of the valid indices for this collection")
    }
}

//数字装箱
fun numBox() {
    val a: Int = 10000;
    println("对象地址同一性：" + (a === a))
    println("对象内容相等性：" + (a == a))
    val boxedA: Int = a
    val boxedB: Int? = a
    println("对象地址同一性：" + (boxedA === boxedB))//boxedA: Int?、boxedB: Int? 只要一个加了问号，返回false ，不加返回true
    println("对象内容相等性：" + (boxedA == boxedB))

}

//标签返回---lamba
fun labelReturn1() {
    listOf(1, 2, 3, 4, 5, 6).forEach {
        if (it == 3) return //直接跳出整个方法
        println(it)
    }
    println("zhm-labelReturn1")
}

fun labelReturn2() {
    listOf("a", "b", "c", "d", "e").forEach limit@{
        if (it == "c") return@limit //跳出本次循环
        println(it)
    }
    println("zhm-labelReturn2")
}

fun labelReturn3() {
    listOf("a", "b", "c", "d", "e").forEach {
        if (it == "c") return@forEach //跳出本次循环
        println(it)
    }
    println("zhm-labelReturn3")
}

fun labelReturn4() {
    listOf("a", "b", "c", "d", "e").forEach(
            fun(str: String) {
                if (str == "c") return  //跳出本次循环
                println(str)
            }
    )
    println("zhm-labelReturn4")
}


