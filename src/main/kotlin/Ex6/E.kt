import java.lang.Math.pow
import java.math.BigDecimal

fun main(){
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    val c = readLine()!!.toLong()


    var l:Long = 0
    var r = pow(10.0, 16.0).toLong()
    var min = r
    while (l < r){
        val m = l + (r - l) / 2
        val value = (BigDecimal(a.toString()) * BigDecimal("2") +
                BigDecimal(b.toString()) * BigDecimal("3") +
                BigDecimal(c.toString()) * BigDecimal("4") +
                BigDecimal(m.toString()) * BigDecimal("5")) /
                (BigDecimal(a.toString()) + BigDecimal(b.toString()) +
                        BigDecimal(c.toString()) + BigDecimal(m.toString()))
        if (value >= BigDecimal("4")){
            r = m
            min = m
        } else {
            l = m+1
        }
    }

    print(min)
}