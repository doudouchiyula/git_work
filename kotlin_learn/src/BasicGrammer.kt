fun main(args: Array<String>) {
    var grammer: TestGrammer = TestGrammer()

    var sum1 = grammer.sum1(2, 6);
    print(sum1)

}

class TestGrammer {
    fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    public fun sum3(a: Int, b: Int): Int {
        return a + b
    }

    public fun sum4(a: Int, b: Int): Int = a + b
}





