package Ex3

fun main() {
    val ls = readLine()!!.trim().split(" ").map{ it.toInt() }
    val set = mutableSetOf<Int>()

    for (i in 0 until ls.size){
        if (!set.contains(ls[i])){
            set.add(ls[i])
        }
    }

    print(set.size)
}