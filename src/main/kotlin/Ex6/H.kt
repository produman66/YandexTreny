package Ex6

fun main() {
    val (N, K) = readLine()!!.split(" ").map { it.toInt() }
    val mass = LongArray(N)
    for (i in mass.indices) {
        mass[i] = readLine()!!.toLong()

    }

    var max = 0L

    var l = 0L
    var r = 100000001L

    while (l < r) {
        val mid = l + (r - l) / 2
        if (mid == 0L){
            print(0)
            return
        }
        var value = 0L
        for (i in mass.indices) {
            value += mass[i] / mid
        }

        if (value > K) {
            max = mid
            l = mid + 1
        }else if (value < K){
            r = mid
        }
        else {
            max = mid
            l = mid + 1
        }
    }

    print(max)
}