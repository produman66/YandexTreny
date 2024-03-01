package Ex6

import java.lang.StringBuilder
fun main() {
    var (N, K) = readLine()!!.split(" ")
    val a = readLine()!!.trim().split(" ").map { it.toInt() }.toIntArray()

    val b = readLine()!!.trim().split(" ")

    val str = StringBuilder()
    for (i in b.indices) {
        val num = b[i].toInt()
        var l = -1
        var r = a.size
        while (l+1 < r) {
            val m = l + (r - l) / 2
            if (a[m] > num) {
                r = m
            } else {
                l = m
            }
        }
        if (l==-1){
            str.append("${a[0]}\n")
        }
        else if (r == a.size){
            str.append("${a[a.size-1]}\n")
        }
        else if (a[l] == num || a[r] == num){
            str.append("${b[i]}\n")
        }
        else if (num- a[l] > a[r] - num){
            str.append("${a[r]}\n")
        }
        else{
            str.append("${a[l]}\n")
        }
    }
    print(str.toString())
}


