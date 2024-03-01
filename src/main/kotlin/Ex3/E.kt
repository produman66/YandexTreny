package Ex3

fun main(){
    var ans = 0
    val ls = readLine()!!.trim().split(" ").map{ it.toInt() }.toHashSet()
    val str = readLine()!!

    for (i in 0 until str.length){
        if (str[i].toString().toInt() !in ls){
            ans ++
            ls.add(str[i].toString().toInt())
        }
    }

    print(ans)
}