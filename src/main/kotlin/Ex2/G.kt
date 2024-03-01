package Ex2

    fun main(){
        val ls = readLine()!!.trim().split(" ").map { it.toLong() }
    //    val ls = ls1.map { it.toInt() }
        var max1:Long
        var max2:Long
        var min1:Long
        var min2:Long
        if (ls[0] >= ls[1]){
            max1 = ls[0]
            max2 = ls[1]
            min1 = ls[1]
            min2 = ls[0]
        }else {
            max2 = ls[0]
            max1 = ls[1]
            min2 = ls[1]
            min1 = ls[0]
        }
        for (i in 2 until ls.size){
            if (ls[i] >= max1){
                max2 = max1
                max1 = ls[i]
            }
            else if (ls[i] >= max2){
                max2 = ls[i]
            }
        }


        for (i in 2 until ls.size){
            if (ls[i] <= min1){
                min2 = min1
                min1 = ls[i]
            }
            else if (ls[i] <= min2){
                min2 = ls[i]
            }
        }

        if (min1 * min2 > max1 * max2){
            print("$min1 $min2")
        }else {
            print("$max2 $max1")
        }

    }