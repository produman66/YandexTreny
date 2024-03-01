package Ex1

fun append(num:String, sl: MutableList<List<Int>>){
    val number = mutableListOf<Int>()
    for (i in 0 until num.length){
        if (num[i].isDigit()){
            number.add(num[i].toString().toInt())
        }
    }
    if (number.size == 7) {
        number.add(0, 8)
        number.add(1, 5)
        number.add(1, 9)
        number.add(1, 4)
    }
    if (number.size == 10) {
        number.add(0, 8)
    }
    if (number.size == 8){
        number.add(1, 5)
        number.add(1, 9)
        number.add(1, 4)
    }
    number[0] = 8
    sl.add(number)
}

fun main(){
    val num = readLine()!!
    val num1 = readLine()!!
    val num2 = readLine()!!
    val num3 = readLine()!!

    val sl = mutableListOf<List<Int>>()

    append(num, sl)
    append(num1, sl)
    append(num2, sl)
    append(num3, sl)
    for (i in 1 until sl.size){
        var flag = true
        for (j in 0 until sl[i].size){
            if (sl[0][j] != sl[i][j]){
                println("NO")
                flag = false
                break
            }
        }
        if (flag){
            println("YES")
        }
    }
}

