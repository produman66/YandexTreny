package Ex1

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val ans = IntArray(3)
    ans[0] = scanner.nextInt()
    ans[1] = scanner.nextInt()
    ans[2] = scanner.nextInt()
    val max = ans.maxOrNull()
    val min = ans.minOrNull()
    val sr = ans.sum() - (min ?: 0) - (max ?: 0)
    if (max != null && min != null && max <= sr + min) {
        print("YES")
    } else {
        print("NO")
    }
}