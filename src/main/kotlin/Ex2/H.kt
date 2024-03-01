package Ex2

import kotlin.math.abs
//
//fun func(ls1: List<Int>, max1: Int, max2: Int, max3: Int) : Int{
//    var max = 0
//    for (i in 0 until ls1.size){
//        if (ls1[i] > ls1[max] && i != max3 && i != max2 && i != max1){
//            max = i
//        }
//    }
//    return max
//}
//
//fun main(){
//
//    val ls1 = readLine()!!.trim().split(" ").map { it.toInt() }
//    val ls = ls1.map { abs(it) }
//    var zn1 = 0
//    var max1 = 0
//    var max2 = 0
//    var max3 = 0
//    if (ls[0] >= ls[1] && ls[1] >= ls[2]){
//        max1 = 0
//        max2 = 1
//        max3 = 2
//    }else if (ls[0] >= ls[2] && ls[2] >= ls[1]){
//        max1 = 0
//        max2 = 2
//        max3 = 1
//    }else if (ls[1] >= ls[0] && ls[0] >= ls[2]){
//        max1 = 1
//        max2 = 0
//        max3 = 2
//    }
//    else if (ls[1] >= ls[2] && ls[2] >= ls[0]){
//        max1 = 1
//        max2 = 2
//        max3 = 0
//    }
//    else if (ls[2] >= ls[0] && ls[0] >= ls[1]){
//        max1 = 2
//        max2 = 0
//        max3 = 1
//    }else if (ls[2] >= ls[1] && ls[1] >= ls[0]){
//        max1 = 2
//        max2 = 1
//        max3 = 0
//    }
//
//
//    for (i in 3 until ls.size){
//        if (ls[i] >= ls[max1]){
//            max3 = max2
//            max2 = max1
//            max1 = i
//        }
//        else if (ls[i] >= ls[max2]){
//            max3 = max2
//            max2 = i
//        }
//        else if (ls[i] >= ls[max3]){
//            max3 = i
//        }
//    }
//    if (ls1[max1] == 0 || ls1[max2] == 0 || ls1[max3] == 0){
//        print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//        return
//    }
//
//    if (ls1[max1] >= 0 && ls1[max2] >= 0 && ls1[max3] >= 0){
//        print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//    }
//    else if ((ls1[max1] >= 0 && ls1[max2] >= 0 && ls1[max3] < 0)
//        || (ls1[max1] >= 0 && ls1[max2] < 0 && ls1[max3] >= 0)
//        || (ls1[max1] < 0 && ls1[max2] >= 0 && ls1[max3] >= 0)){
//
//        if ((ls1[max1] >= 0 && ls1[max2] >= 0 && ls1[max3] < 0) ){
//            max3 = func(ls1, max1, max2, max3)
//            print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//        }
//        else if ((ls1[max1] >= 0 && ls1[max2] < 0 && ls1[max3] >= 0) ){
//            max2 = func(ls1, max1, max2, max3)
//            print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//        }
//        else {
//            max1 = func(ls1, max1, max2, max3)
//            print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//        }
//    }
//
//    else if ((ls1[max1] < 0 && ls1[max2] < 0 && ls1[max3] >= 0)
//        || (ls1[max1] < 0 && ls1[max2] >= 0 && ls1[max3] < 0)
//        || (ls1[max1] >= 0 && ls1[max2] < 0 && ls1[max3] < 0)){
//        print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//    }
//    else {
//        max3 = func(ls1, max1, max2, max3)
//        print("${ls1[max1]} ${ls1[max2]} ${ls1[max3]}")
//    }
//}


// + + +
// + + -   + - +    - + +
// - - +   - + -    + - -
// - - -
fun init(ls: List<Int>): List<Int>{
    if (ls[0] >= ls[1] && ls[1] >= ls[2]){
        return listOf(0, 1, 2)
    }else if (ls[0] >= ls[2] && ls[2] >= ls[1]){
        return listOf(0, 2, 1)
    }else if (ls[1] >= ls[0] && ls[0] >= ls[2]){
        return listOf(1, 0, 2)
    }else if (ls[1] >= ls[2] && ls[2] >= ls[0]){
        return listOf(1, 2, 0)
    }else if (ls[2] >= ls[0] && ls[0] >= ls[1]){
        return listOf(2, 0, 1)
    }else if (ls[2] >= ls[1] && ls[1] >= ls[0]) {
        return listOf(2, 1, 0)
    }
    return listOf()
}
fun init1(ls: List<Int>): List<Int>{
    if (ls[0] <= ls[1] && ls[1] <= ls[2]){
        return listOf(0, 1, 2)
    }else if (ls[0] <= ls[2] && ls[2] <= ls[1]){
        return listOf(0, 2, 1)
    }else if (ls[1] <= ls[0] && ls[0] <= ls[2]){
        return listOf(1, 0, 2)
    }else if (ls[1] <= ls[2] && ls[2] <= ls[0]){
        return listOf(1, 2, 0)
    }else if (ls[2] <= ls[0] && ls[0] <= ls[1]){
        return listOf(2, 0, 1)
    }else if (ls[2] <= ls[1] && ls[1] <= ls[0]) {
        return listOf(2, 1, 0)
    }
    return listOf()
}
fun main(){

    val ls = readLine()!!.trim().split(" ").map { it.toInt() }

    var (max1, max2, max3) = init(ls)

    for (i in 3 until ls.size){
        if (ls[i] >= ls[max1]){
            max3 = max2
            max2 = max1
            max1 = i
        }
        else if (ls[i] >= ls[max2]){
            max3 = max2
            max2 = i
        }
        else if (ls[i] >= ls[max3]){
            max3 = i
        }
    }

    var (min111, min222, max333) = init1(ls)

    for (i in 3 until ls.size){
        if (ls[i] <= ls[min111]){
            min222 = min111
            min111 = i
        }
        else if (ls[i] <= ls[min222]){
            min222 = i
        }
        else if (ls[i] >= ls[max333]){
            max333 = i
        }
    }
    var l = ls[max1].toLong() * ls[max2].toLong() * ls[max3].toLong()
    var l1 = ls[min111].toLong() * ls[min222].toLong() * ls[max333].toLong()
    if (l >= l1){
        print("${ls[max1]} ${ls[max2]} ${ls[max3]}")
    }
    else {
        print("${ls[min111]} ${ls[min222]} ${ls[max333]}")
    }
}
