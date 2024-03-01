package Ex4

import java.util.*

fun main() {
    val N = readLine()!!.toInt()
    val map = mutableMapOf<String, MutableSet<String>>()


    for (i in 0 until N) {
        val str = readLine()!!

        if (!map.containsKey(str.toLowerCase())) {
            map[str.toLowerCase()] = mutableSetOf()
        }
        map[str.toLowerCase()]!!.add(str)
    }

    val input = readLine()!!.trim()
    if (input.isEmpty()) {
        print(0)
        return
    }
    val txt = input.split(" ")
    var ans = 0
    for (i in txt.indices) {

        if (map.containsKey(txt[i].toLowerCase())) {
            if (map[txt[i].toLowerCase()]!!.contains(txt[i])) {
                ans += 1
            }
        } else {
            var count = 0
            for (j in txt[i].indices) {
                if (txt[i][j].isUpperCase()) {
                    count++
                }
            }
            if (count == 1) {
                ans++
            }
        }
    }
    print(txt.size - ans)
}
