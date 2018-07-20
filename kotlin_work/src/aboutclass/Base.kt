package aboutclass

open class Base(var name: String) {
    init {
        println("初始化 base")
    }
//
//    lateinit var isEmpty3: Int
    lateinit var isEmpty4: String
//    lateinit var isEmpty5: Boolean
//    lateinit var isEmpty6: Double
//    lateinit var isEmpty7: Byte

    open var size: String = name.also { println("初始化base中size+$it") }

    fun covertTostr1(): String {
        return size + "base"
    }

    fun covertToTest(string: String, covertTostr1: () -> String): String {
        return string+covertTostr1()
    }


    open fun converToStr(): String {
        return size.toString()
    }

    val isEmpty1 get() = name.length == 0

    var isEmpty2: Boolean
        get() = name.length == 0
        set(value) {}

    var stringRepresentation: String
        get() = this.toString()
        set(value) {

        }
    var string: String
        get() = this.toString()
        set(value) {}

}