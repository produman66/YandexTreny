package Ex5

fun main(){
    val (n, r) = readLine()!!.trim().split(" ").map { it.toInt() }
    val ls = readLine()!!.trim().split(" ").map { it.toInt() }

    var count = 0

    var i = 0
    var j = 1
    var last = false
    while (i < n && j < n){

        if (ls[j] - ls[i] > r){
            count ++
            i++
            last= true
        }
        else{
            if (!last){
                j++
                last = false
            }
            else {
                j++
                i--
                last = false

            }
        }

    }
    println(count)
}
