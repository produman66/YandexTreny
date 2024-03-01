package Ex1

fun main(){
    val (N, K, M) = readLine()!!.split(" ").map{ it.toInt() }


    var iz = N / K
    var ost = N % K
    var count = 0

    if (K < M) {
        print(0)
        return
    }
    while (iz != 0){
        count += (K / M) * iz
        ost += (K % M) * iz
        iz = ost / K
        ost = ost % K
    }

    print(count)

}