fun main() {
    val t = readLine()!!.toInt()
    val digits = "0123456789"
    val uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val lowercase = "abcdefghijklmnopqrstuvwxyz"
    repeat(t) {
        val (a, b, c) = readLine()!!.split(" ").map { it.toInt() }
        val password = digits.substring(0, a) + uppercase.substring(0, b) + lowercase.substring(0, c)
        println(password)
    }
}
