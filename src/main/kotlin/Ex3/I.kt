package Ex3

fun main(){

    val N = readLine()!!.toInt()

    val union = HashSet<String>()
    val sets = mutableListOf<Set<String>>()

    for (i in 0 until N){
        val M = readLine()!!.toInt()
        val set = HashSet<String>()
        for (j in 0 until M){
            val lang = readLine()!!
            if (lang !in union){
                union.add(lang)
            }
            set.add(lang)
        }
        sets.add(set)
    }
    var intersection = sets[0]
    for (i in 1 until sets.size) {
        intersection = intersection.intersect(sets[i])
    }
    println(intersection.size)
    println(intersection.joinToString("\n"))
    println(union.size)
    println(union.joinToString("\n"))

}
