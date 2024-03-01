package Ex5

fun main(){
    val n = readLine()!!.toInt()
    val ls = readLine()!!.split(" ").map{ it.toInt() }

    val m = readLine()!!.toInt()
    val map = mutableMapOf<Int, Int>()


    for (i in 0 until m){
        val (k, v) = readLine()!!.split(" ").map{ it.toInt() }
        if (!map.containsKey(k)){
            map[k] = v
        }else {
            if (v < map[k]!!){
                map[k] = v
            }
        }
    }
    var sum = 0
    for (i in ls.indices){
        var min = map.values.toList().max()
        map.forEach{
            if (it.key >= ls[i] && min > it.value){
                min = it.value
            }
        }
        sum+= min
        }
    print(sum)
}