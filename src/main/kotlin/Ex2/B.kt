package Ex2

fun main(){

    var a = readLine()!!.toInt()
    var tec = ""
    if (a == - -2000000000){
       print("CONSTANT")
        return
    }
    while(true){

        val b = readLine()!!.toInt()
        if (b == -2000000000)
            break
        if (tec == ""){
            if (a == b){
                tec = "CONSTANT"
            }
            else if (a > b){
                tec = "DESCENDING"
            }
            else if (a < b){
                tec = "ASCENDING"
            }

        }
        else if (tec == "CONSTANT"){
            if (a < b){
                tec = "WEAKLY ASCENDING"
            }
            else if (a > b){
                tec = "WEAKLY DESCENDING"
            }
        }
        else if (tec == "ASCENDING"){
            if (a > b){
                tec = "RANDOM"
            }
            else if (a == b){
                tec = "WEAKLY ASCENDING"
            }
        }
        else if (tec == "DESCENDING"){
            if (a < b){
                tec = "RANDOM"
            }
            else if (a == b){
                tec = "WEAKLY DESCENDING"
            }
        }
        else if (tec == "WEAKLY ASCENDING"){
            if (a > b){
                tec = "RANDOM"
            }
        }
        else if (tec == "WEAKLY DESCENDING"){
            if (a < b){
                tec = "RANDOM"
            }
        }

        a = b
    }

    print(tec)

}