package Ex3

fun main() {
    val ls = readLine()!!.trim().split(" ").map{ it.toInt() }.toSet()
    val ls1 = readLine()!!.trim().split(" ").map{ it.toInt() }.toSet()
    val ans = mutableListOf<Int>()

    for (num in ls) {
        if (num in ls1) {
            ans.add(num)
        }
    }
    ans.sort()
    println(ans.joinToString(" "))
}