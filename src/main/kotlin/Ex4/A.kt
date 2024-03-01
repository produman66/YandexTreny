package Ex4

fun main(){
    val N = readLine()!!.toInt()
    val map = mutableMapOf<String, String>()

    for (i in 0 until N){
        val (value, key) = readLine()!!.trim().split(" ")
        map[value] = key
        map[key] = value
    }
    val key = readLine()!!
    print(map[key])
}