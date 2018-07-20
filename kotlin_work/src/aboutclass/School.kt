package aboutclass

class School(name: String, val lastName: String) : Base(name.capitalize().also { println("arguments for base :$it") }), testInterface {
    override var donkey: String="pp"


    override fun dog() {
        println("接口必须实现的方法")
    }

    override fun cat() {
//        super.cat()  可以实现可以不实现父接口的方法
        println("接口可选择实现的方法")
    }

    init {
        println("init school")
    }

    override var size: String = (super.size + lastName).also { println("arguments for school :+$it") }

    override fun converToStr(): String {
        return size.toString()
    }


}

fun MutableList<Int>.swap(index1:Int,index2: Int) {
    val temp=this[index1]
    this[index1]=this[index2]
    this[index2]=temp
}