package Ex3

fun main() {
    val input = StringBuilder()
    while (true) {
        val line = readLine() ?: break
        if (line.isBlank()) break

        input.append(line).append(" ")
    }
    val ans = input.toString().split(" ")
    val set = HashSet<String>()
    for (i in 0 until ans.size){
        if (ans[i] !in set && ans[i] != " " && ans[i] != ""){
            set.add(ans[i])
        }
    }
    print(set.size)
}