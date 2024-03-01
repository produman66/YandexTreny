package Ex4

fun main(){
    val (q, S) = readLine()!!.split(" ").map{it.toInt()}

    val map = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()

    val W = readLine()!!
    val g = readLine()!!

    if (W.length > g.length){
        print(0)
        return
    }

    for (i in W.indices){
        if (!map.containsKey(W[i])){
            map[W[i]] = 0
        }
        map[W[i]] = map[W[i]]!! + 1
    }


    var i = 0
    var ans = 0


    for (j in g.indices) {
        if (j - i < q) {
            if (!map2.containsKey(g[j])) {
                map2[g[j]] = 0
            }
            map2[g[j]] = map2[g[j]]!! + 1
        } else {
            if (!map2.containsKey(g[j])) {
                map2[g[j]] = 0
            }
            map2[g[j]] = map2[g[j]]!! + 1
            map2[g[i]] = map2[g[i]]!! - 1
            if (map2[g[i]] == 0) {
                map2 -= g[i]
            }
            i++
        }
        if (map == map2) {
            ans += 1
        }
    }
    print(ans)
}
