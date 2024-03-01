package Ex5
//fun main(){
//    val N = readLine()!!.toInt()
//    val key = mutableListOf<Int>()
//    val value = mutableListOf<Int>()
//
//
//    for (i in 0 until N){
//        val (k, v) = readLine()!!.split(" ").map{ it.toInt() }
//        key.add(k)
//        value.add(v)
//    }
//
//    if (key[0]!=1){
//        key.add(0, 1)
//        value.add(0, 1)
//    }
//
//    val M = readLine()!!.toInt()
//    var count = 0
//    var j = 0
//    for (i in 0 until M){
//        count = 0
//        j = 0
//        val (l, r) = readLine()!!.split(" ").map { it.toInt() }.sorted()
//        var start = 0
//        while (key[j] < r){
//            if (key[j] == l || (j != 0 && key[j-1] < l && key[j] > l)){
//                start = value[j]
//            }
//            if (key[j] > l) {
//                if (count < value[j]){
//                    count = value[j]
//                }
//                if (key[j] != r && j < key.size - 1 && key[j+1] > r){
//                    if (count < value[j+1]){
//                        count = value[j+1]
//                    }
//                }
//            }
//            j++
//        }
//        if (count - start > 0){
//            println(count - start)
//        }else {
//            println(0)
//        }
//    }
//}

//fun main(){
//    val n = readLine()!!.toInt()
//    val a = mutableListOf(0, 0)
//    val b = mutableListOf(0, 0)
//    var xPrev = -1
//    var yPrev = -1
//
//    for (i in 0 until n) {
//        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//        if (xPrev == -1) {
//            xPrev = x
//            yPrev = y
//        } else if (y > yPrev) {
//            a.add(a.last() + y - yPrev)
//            b.add(b.last())
//            xPrev = x
//            yPrev = y
//        } else {
//            a.add(a.last())
//            b.add(b.last() + yPrev - y)
//            xPrev = x
//            yPrev = y
//        }
//    }
//
//    val m = readLine()!!.toInt()
//    for (i in 0 until m)  {
//        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
//        if (x < y) {
//            println(a[y] - a[x])
//        } else {
//            println(b[x] - b[y])
//        }
//    }
//