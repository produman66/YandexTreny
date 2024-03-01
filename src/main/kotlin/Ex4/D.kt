package Ex4

fun main(){
    val n = readLine()!!.toInt()
    val cl = readLine()!!.trim().split(" ").map { it.toInt() }.toMutableList()
    val k = readLine()!!.toInt()
    val p = readLine()!!.trim().split(" ").map { it.toInt() }

    for (i in 0 until p.size){
        cl[p[i]-1] -= 1
    }

    for (i in 0 until cl.size){
        if (cl[i] < 0){
            println("YES")
        }else {
            println("NO")
        }
    }
}