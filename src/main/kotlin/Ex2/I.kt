package Ex2

fun main(){
    val (N, M, K) = readLine()!!.trim().split(" ").map{ it.toInt() }

    val ls = mutableSetOf<Pair<String, String>>()

    repeat(K){
        val (x, y) = readLine()!!.trim().split(" ")
        var pair =  Pair(x, y)
        ls.add(pair)
    }

    val mx = mutableListOf<MutableList<String>>()

    for (i in 0 until N){
        val mx1 = mutableListOf<String>()
        for (j in 0 until M){
            if (ls.contains(Pair((i+1).toString(), (j+1).toString()))){
                mx1.add("*")
            }else {
                mx1.add("0")
            }
        }

        mx.add(mx1)
    }


    for (i in 0 until N){
        for (j in 0 until M){
            if (i == 0){
                if (mx[i][j] != "*"){
                    if (j != 0 && mx[i][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (i != N - 1 && mx[i+1][j] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (i != N - 1 && j != M-1 && mx[i+1][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (i != N - 1 && j != 0 && mx[i+1][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                }
            }
            else if (i == N-1){
                if (mx[i][j] != "*"){
                    if (j != 0 && mx[i][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (mx[i-1][j] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i-1][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != 0 && mx[i-1][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                }
            }
            else {
                if (mx[i][j] != "*"){
                    if (j != 0 && mx[i][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (mx[i+1][j] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (mx[i-1][j] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i-1][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != M-1 && mx[i+1][j+1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != 0 && mx[i-1][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                    if (j != 0 && mx[i+1][j-1] == "*"){
                        mx[i][j] =  (mx[i][j].toInt() + 1).toString()
                    }
                }
            }
        }
    }

//    for (i in 0 until N){
//        for (j in 0 until M){
//            print("${mx[i][j]} ")
//        }
//        println()
//    }
}