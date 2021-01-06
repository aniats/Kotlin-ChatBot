fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    var bigger: Boolean = false
    var smaller: Boolean = false

    if (a <= b || a <= c) {
        smaller = true
    }

    if (a >= b || a >= c) {
        bigger = true
    }
    println(bigger && smaller)
}