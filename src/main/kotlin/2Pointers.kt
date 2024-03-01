import java.lang.Integer.max


fun main(){
    val ls = listOf<Int>(1, 1, 3, 3, 4, 6, 11)
    val ans = func(ls)
    print(ans)
}


fun func(ls:List<Int>) : Int{
    var bestsum = 0
    var nowsum = 0
    var last = 0

    for (i in ls.indices){
        while (last < ls.size && (last == i || ls[i] + ls[i+1] >= ls[last])){
            nowsum += ls[last]
            last += 1
        }
        bestsum = max(bestsum, nowsum)
        nowsum -= ls[i]
    }

    return bestsum
}