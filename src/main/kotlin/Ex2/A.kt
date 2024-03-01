package Ex2

fun main(){
    val list = readLine()!!.split(" ").map{ it.toInt() }
    for (i in 0 until list.size - 1){
        if (list[i] >= list[i+1]){
            print("NO")
            return
        }
    }
    print("YES")
}