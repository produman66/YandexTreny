package Ex5

import kotlin.math.abs

fun main(){
    val N = readLine()!!.toInt()
    val n = readLine()!!.split(" ").map{ it.toInt() }
    val M = readLine()!!.toInt()
    val m = readLine()!!.split(" ").map{ it.toInt() }

    var min = abs(n[0] - m[0])
    var ans1 = n[0]
    var ans2 = m[0]

    var i = 0
    var j = 0

    while (i != n.size && j != m.size){

        if (n[i] == m[j]){
            ans1 = n[i]
            ans2 = m[j]
            break
        }

        if (n[i] < m[j]){
            if (min > m[j] - n[i]){
                min = m[j] - n[i]
                ans1 = n[i]
                ans2 = m[j]
            }
            i++
        }
        else {
            if (min > n[i] - m[j]){
                min = n[i] - m[j]
                ans1 = n[i]
                ans2 = m[j]
            }
            j++
        }
    }

    print("$ans1 $ans2")
}