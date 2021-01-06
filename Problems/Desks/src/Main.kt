fun cntDesks(desks: Int): Int {
    return if (desks % 2 == 1) {
        desks / 2 + 1
    } else {
        desks / 2
    }
}

fun main(args: Array<String>) {
    val class1 = readLine()!!.toInt()
    val class2 = readLine()!!.toInt()
    val class3 = readLine()!!.toInt()
    val res = cntDesks(class1) + cntDesks(class2) + cntDesks(class3)
    println(res)
}