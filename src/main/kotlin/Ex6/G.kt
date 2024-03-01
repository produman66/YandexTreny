package Ex6

fun main(){
    var n = readLine()!!.toLong()
    var m = readLine()!!.toLong()
    var t = readLine()!!.toLong()
    var l = 0L
    var r = m*n
    var max = 0L
    while (l < r){
        val mid = l + (r - l) / 2
        if ((n - (2 * mid) > 0) && (m - (2 * mid)) > 0){
            val area = n * m - ((n - (2 * mid)) * (m - (2 * mid)))
            if (area <= t){
                if (max < mid){
                    max = mid
                }
                l = mid + 1
            }
            else {
                r = mid
            }
        }
        else {
            r = mid
        }
    }
    print(max)
}