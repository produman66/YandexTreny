package Ex4

//fun main() {
//    val input.txt = StringBuilder()
//    while (true) {
//        val line = readLine() ?: break
//        if (line.isBlank()) break
//
//        input.txt.append(line).append(" ")
//    }
//    val ans = input.txt.toString().split(" ")
//    val map = mutableMapOf<String,Int>()
//
//    var maxKey = ""
//    var maxValue = 0
//    val ls = mutableListOf<String>()
//    for (i in 0 until ans.size){
//        if (ans[i] == ""){
//            continue
//        }
//        if (!map.containsKey(ans[i])){
//            map[ans[i]] = 0
//        }
//        map[ans[i]] = map[ans[i]]!! + 1
//        if (maxValue < map[ans[i]]!!){
//            maxKey = ans[i]
//            maxValue = map[ans[i]]!!
//            ls.clear()
//            ls.add(maxKey)
//        }
//        else if (maxValue == map[ans[i]]!! && maxKey != ans[i]){
//            ls.add(ans[i])
//        }
//
//    }
//    val sorted = ls.sorted()
//    print(sorted[0])
//}

fun main() {
    val input = generateSequence { readLine() }.takeWhile { it.isNotBlank() }.joinToString(separator = " ")
    val ans = input.trim().split(" ").filter { it != "" }
    var maxKey = ""
    var maxValue = 0
    val ls = mutableListOf<String>()
    val map = mutableMapOf<String,Int>()
    for (i in 0 until ans.size){
        if (ans[i] == ""){
            continue
        }
        if (!map.containsKey(ans[i])){
            map[ans[i]] = 0
        }
        map[ans[i]] = map[ans[i]]!! + 1
        if (maxValue < map[ans[i]]!!){
            maxKey = ans[i]
            maxValue = map[ans[i]]!!
            ls.clear()
            ls.add(maxKey)
        }
        else if (maxValue == map[ans[i]]!! && maxKey != ans[i]){
            ls.add(ans[i])
        }

    }
    val sorted = ls.sorted()
    print(sorted[0])
}

