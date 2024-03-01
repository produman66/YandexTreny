package Ex6

import java.io.File
import java.lang.StringBuilder

fun main() {
    val lines = File("C:\\Users\\bezru\\IdeaProjects\\YandexTreny\\src\\main\\kotlin\\input.txt").readLines()
    val firstLine = lines[0].split(" ")
    val a = lines[1].split(" ").map { it.toInt() }
    val b = lines[2].split(" ").map { it.toInt() }

    val N = firstLine[0].toInt()
    val K = firstLine[1].toInt()


    val str = StringBuilder()
    for (i in b) {
        var l = 0
        var r = a.size - 1
        var m = l + (r - l) / 2
        while (a[m] != i && l < r) {
            if (a[m].toInt() >= i.toInt()) {
                r = m
            } else {
                l = m + 1
            }
            m = l + (r - l) / 2
        }

        if (a[m] == i) {
            str.append("YES\n")
        } else {
            str.append("NO\n")
        }
    }

    print(str.toString())
}


