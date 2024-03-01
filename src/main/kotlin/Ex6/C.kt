package Ex6

fun main() {
    val (w, h, n) = readLine()!!.split(" ").map{ it.toLong() }
    var max = 1L
    if (w > h){
        max = w * n
    }
    else {
        max = h * n
    }

    var l = 1L
    var r = max

    var min = r
    while (l < r){
        val m = l + (r - l) / 2
        if ((m / w) * (m / h) >= n){
            r = m
            if (m < min){
                min = m
            }
        }
        else {
            l = m+1
        }
    }

    print(min)
}