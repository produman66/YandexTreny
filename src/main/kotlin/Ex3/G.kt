package Ex3

fun main(){
    val N = readLine()!!.toInt()
    val set = HashSet<Pair<Int, Int>>()

    for (i in 0 until N){
        val (x, y) = readLine()!!.trim().split(" ").map{ it.toInt() }
        val pair = Pair(x, y)
        if (x + 1 <= N && y + 1 <= N && x + y + 1 == N){
            if (pair !in set){
                set.add(Pair(x, y))
            }
        }
    }

    print(set.size)
}