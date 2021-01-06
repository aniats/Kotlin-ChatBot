import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

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