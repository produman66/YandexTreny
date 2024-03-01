package Ex5

import kotlin.math.abs

fun main(){
    val (N, K) = readLine()!!.split(" ").map{ it.toInt() }

    val ls = readLine()!!.split(" ").map{ it.toInt() }
    if (N == 1){
        if (ls[0] == K){
            print(1)
            return
        }
        else{
            print(0)
            return
        }
    }
    val pref = prefixls(ls)
    var count = 0
    var j = 1
    var i = 0

    while (i < pref.size && j < pref.size){
         if (pref[j] - pref[i] > K){
             i++
         }
         else if (pref[j] - pref[i] < K){
             j ++
         }
        else {
             count++
             i++
        }
    }

    print(count)
}

fun prefixls(ls: List<Int>): IntArray {
    val pref = IntArray(ls.size + 1)
    pref[0] = 0

    for (i in 1 until pref.size){
        pref[i] = pref[i-1] + ls[i-1]
    }


    return pref
}