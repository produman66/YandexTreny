package Ex2

fun main(){
    var n = readLine()!!.toInt()

    var ls = readLine()!!.split(" ").map{ it.toInt() }

    var top1 = 0
    var top2 = 0
    var top3 = 0

    var flag = false

    var trac = 0
    var ans = 1

    for (i in 0 until ls.size){
        if (ls[i] > top1){
            top3 = top2
            top2 = top1
            top1 = ls[i]

        }
        else if (ls[i] <= top1 && ls[i] >= top2){
            top3 = top2
            top2 = ls[i]
        }
        else if (ls[i] <= top2 && ls[i] >= top3){
            top3 = ls[i]
        }

    }

    for (i in 0 until ls.size - 1){
        if (ls[i] % 10 == 5 && flag == true && ls[i+1] < ls[i]){
            trac = ls[i]
        }
        else if (ls[i] == top1 || ls[i] == top2 || ls[i] == top3){
            flag = true
        }
    }

    for (i in 0 until ls.size){
        if (trac < ls[i]){
            ans += 1
        }
    }
    if (trac != 0){
        print(ans)
    }
    else {
        print(0)
    }
}