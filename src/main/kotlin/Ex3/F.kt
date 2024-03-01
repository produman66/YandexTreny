package Ex3

fun main(){
    val str1 = readLine()!!
    val str2 = readLine()!!

    val set2 = HashSet<String>()

    var count = 0

    for (i in 0 until str2.length - 1){
        set2.add("${str2[i]}${str2[i+1]}")
    }

    for (i in 0 until str1.length - 1){
        if ("${str1[i]}${str1[i+1]}" in set2){
            count += 1
        }
    }

    print(count)
}