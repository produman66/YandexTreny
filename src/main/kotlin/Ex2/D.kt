package Ex2

fun main(){
    val ls = readLine()!!.split(" ").map{ it.toInt() }

    var count = 0

    for (i in 1 until ls.size - 1){
        if (ls[i] > ls[i-1] && ls[i] > ls[i+1]){
            count ++
        }
    }

    print(count)

}