package Ex3

fun main(){
    val N = readLine()!!.toInt()

    val set = HashSet<Int>()

    for (i in 0 until N){
        val (x, y) = readLine()!!.trim().split(" ").map{ it.toInt() }
        if (x !in set){
            set.add(x)
        }
    }
    print(set.size)
}