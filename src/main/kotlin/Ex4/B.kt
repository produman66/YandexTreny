package Ex4

fun main() {
    val input = StringBuilder()
    while (true) {
        val line = readLine() ?: break
        if (line.isBlank()) break

        input.append(line).append(" ")
    }
    val ans = input.toString().split(" ")
    val map = mutableMapOf<String,Int>()

    val ls = mutableListOf<Int>()
    for (i in 0 until ans.size){
        if (ans[i] == ""){
            continue
        }
        if (!map.containsKey(ans[i])){
            map[ans[i]] = 0
        }
        ls.add(map[ans[i]]!!)
        map[ans[i]] = map[ans[i]]!! + 1
    }
    print(ls.joinToString(" "))
}
//0 0 0 0 0 0 1 0 0 1 0 0 1 0 2 2 0 0 0 0 1 2 3 3 1 1 4 0 1 0 1 2 4 1 5 0 0
//0 0 0 0 0 0 1 0 0 1 0 0 1 0 2 2 0 0 0 0 1 2 3 3 1 1 4 0 1 0 1 2 4 1 5 0 0