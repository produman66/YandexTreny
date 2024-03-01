package Ex1

fun main(){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    var x:Int?

    if (c < 0){
        print("NO SOLUTION")
        return
    }

    else if (a == 0){
        if (b == 0){
            if (c == 0){
                print("MANY SOLUTIONS")
                return
            }
            else {
                print("NO SOLUTION")
                return
            }
        } else if (b < 0){
            print("NO SOLUTION")
            return
        } else {
            if (b == c*c){
                print("MANY SOLUTIONS")
                return
            }else {
                print("NO SOLUTION")
                return
            }
        }
    }

    else if (b == 0){
        if (a < 0){
            print("NO SOLUTION")
            return
        }
        else {
            if (c * c % a == 0){
                x = (c * c / a)
                if (x <= (-b / a)){
                    print(x)
                    return
                }else {
                    print("NO SOLUTION")
                    return
                }
            }
            else {
                print("NO SOLUTION")
                return
            }
        }
    }


    if (c == 0){
        if (b % a == 0){
            x = -b / a
            print(x)
            return
        }else {
            print("NO SOLUTION")
            return
        }
    }

    else {
        if ((c * c - b) % a == 0){
            x = (c * c - b) / a
            if (a > 0){
                if (x >= -b / a){
                    print(x)
                    return
                }else {
                    print("NO SOLUTION")
                    return
                }
            }
            else {
                if (x <= -b / a){
                    print(x)
                    return
                }else {
                    print("NO SOLUTION")
                    return
                }
            }
        }
        else {
            print("NO SOLUTION")
            return
        }
    }
}