package Ex6

fun main(){
    val (N, x, y) = readLine()!!.split(" ").map{ it.toLong() }

    var l = 0L
    var r = 10000000000
    var min = 0L
    if (x < y){
        min = x
    }
    else {
        min = y
    }

    if (N == 1L){
        print(min)
        return
    }

    while (l < r){
        var m = l + (r - l) / 2
        m -= min
        val value = m / x + m / y
        if (value < N-1){
            l = m + min + 1
        }
        else {
            r = m + min
        }
    }

    print(r)
}