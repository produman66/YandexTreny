package Ex1

data class Interval(val start: Int, val end: Int)

fun findIntersection(interval1: Interval, interval2: Interval): Interval? {
    val intersectionStart = maxOf(interval1.start, interval2.start)
    val intersectionEnd = minOf(interval1.end, interval2.end)

    return if (intersectionStart <= intersectionEnd) Interval(intersectionStart, intersectionEnd) else null
}

fun main() {
    var a1 = readLine()!!.toInt()
    var a2 = readLine()!!.toInt()
    var c1 = readLine()!!.toInt()
    var c2 = readLine()!!.toInt()

    var v1 = a1 + 1
    var v2 = a2 + 1

    val min1 = c1 * v1 - a1
    val min2 = c2 * v2 - a2

    val max1 = c1 * v1 + a1
    val max2 = c2 * v2 + a2

    val interval1 = Interval(min1, max1)
    val interval2 = Interval(min2, max2)

    val intersection = findIntersection(interval1, interval2)
    if (intersection != null) {
        print("${intersection.start} ${intersection.end}")
    } else {
        print(-1)
    }
}