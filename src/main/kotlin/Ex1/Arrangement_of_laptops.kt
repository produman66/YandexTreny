package Ex1

fun main() {
    val (a, b, c, d) = readLine()!!.split(" ").map{ it.toInt() }

    var a1 = ((a + c) * if (b > d) b else d)
    var a2 = ((a + d) * if (b > c) b else c)
    var a3 = ((b + c) * if (a > d) a else d)
    var a4 = ((b + d) * if (a > c) a else c)

    var minCode = minOf(a1, a2, a3, a4)

    if (minCode == a1){
        print("${a+c} ${if (b > d) b else d}")
    }
    else if (minCode == a2){
        print("${a + d} ${if (b > c) b else c}")
    }
    else if (minCode == a3){
        print("${b + c} ${if (a > d) a else d}")
    }else {
        print("${b + d} ${if (a > c) a else c}")
    }

}