package Ex1

fun main(){
    val A = readLine()!!.toInt()
    val B = readLine()!!.toInt()
    val C = readLine()!!.toInt()
    val D = readLine()!!.toInt()
    val E = readLine()!!.toInt()

    if ((A <= D && B <= E) || (A <= E && B <= D) || (B <= D && C <= E) || (B <= E && C <= D) || (C <= E && A <= D) || (A <= E && C <= D)){
        print("YES")
    }else {
        print("NO")
    }
}