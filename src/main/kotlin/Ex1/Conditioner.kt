package Ex1

fun main(){
    val (tr, tc) = readLine()!!.split(" ").map { it.toInt() }

    val str = readln()

    if (str == "freeze"){
        if (tr > tc){
            print(tc)
        }
        else{
            print(tr)
        }
    }
    else if (str == "heat"){
        if (tr < tc){
            print(tc)
        }
        else{
            print(tr)
        }
    }
    else if (str == "auto"){
        print(tc)
    }
    else {
        print(tr)
    }
}