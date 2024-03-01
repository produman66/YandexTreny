package Ex6

fun main() {
    val (n, a, b, w, h) = readLine()!!.split(" ").map { it.toLong() }
    val max = w

    var l = 0L
    var r = max

    var maxx = l
    while (l < r) {
        val d = l + (r - l) / 2
        val x = a + 2 * d
        val y = b + 2 * d

        if ((x <= w && y <= h || y <= w && x <= h) && ((((w / x) * (h/y)) >= n) || (((h / x) * (w/y)) >= n))) {
            l = d + 1
            maxx = d
        } else {
            r = d
        }
    }

    print(maxx)
}