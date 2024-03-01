package Ex2

import kotlin.math.abs


fun main(){
    val N = readLine()!!.toInt()

    val ls = readLine()!!.split(" ").map{ it.toInt() }

    val x = readLine()!!.toInt()

    var index = 0
    var ans = abs(x - ls[0])
    for (i in 1 until ls.size){
        if (abs(x - ls[i]) < ans){
            index = i
            ans = abs(x - ls[i])
        }
    }

    print(ls[index])
}