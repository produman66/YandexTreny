fun main() {

    val (N, M) = readLine()!!.trim().split(" ").map{ it.toInt() }

    val n = HashSet<Int>(N)
    val m = HashSet<Int>(M)

    repeat(N) {
        n.add(readLine()!!.toInt())
    }

    repeat(M) {
        m.add(readLine()!!.toInt())
    }

    val ans1 = n.intersect(m).toSortedSet()
    val ans2 = n.subtract(m).toSortedSet()
    val ans3 = m.subtract(n).toSortedSet()

    println(ans1.size)
    println(ans1.joinToString(" "))
    println(ans2.size)
    println(ans2.joinToString(" "))
    println(ans3.size)
    println(ans3.joinToString(" "))
}