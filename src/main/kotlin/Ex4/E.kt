package Ex4

fun main(){
    val N = readLine()!!.toInt()
    val map = mutableMapOf<Long, Long>()
    var ans = 0
    for (i in 0 until N){
        val (k, v) = readLine()!!.split(" ").map{ it.toLong() }
        if (!map.containsKey(k)){
            map[k] = v
        }else {
            if (map[k]!! < v){
                map[k] = v
            }
        }
    }

    val value: Long = map.values.toList().sum()
    print(value)
}