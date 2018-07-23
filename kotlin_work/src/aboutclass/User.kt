package aboutclass

/**
 * 密封类
 */
sealed class User {

}

data class const(var name: String) : User() {

}

data class nums(var number: Double) : User() {

}

object NotNumAndStr : User()

fun checkData(user: User): Double = when (user) {
    is const -> 0.0
    is nums -> user.number
    NotNumAndStr -> Double.NaN

}