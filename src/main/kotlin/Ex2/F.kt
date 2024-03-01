package Ex2

fun main(){

    val N = readLine()!!.toInt()
    val ls = readLine()!!.split(" ").subList(0, N)
    var index = 0
    for (i in 0 until ls.size){
        var k = 0
        var j = i
        while (j < ls.size - 1 - k){
            if (ls[j] == ls[ls.size - 1 - k]){
                k++
                j++
            }else {
                break
            }
        }

        // 1 2 3 4 5 5
        if (j > ls.size - 1 - k || j == ls.size - 1 - k){
            index = i
            break
        }
    }
    println(index)
    if (index != 0){
        for (i in index - 1 downTo 0){
            print("${ls[i]} ")
        }
    }
}