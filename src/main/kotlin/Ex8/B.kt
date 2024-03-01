package Ex8

fun main(){
    val ls = readLine()!!.split(" ").map { it.toInt() }

    if (ls[0] == 0){
        print(0)
        return
    }
    val tr = TreeB(ls[0])
    print("1 ")

    for (i in 1 until ls.size - 1){
        addB(tr, ls[i], 1)
    }
}

fun addB(root: TreeB?, data: Int, count:Int): TreeB {
    var temp = root
    if (temp == null) {
        temp = TreeB(data)
        print("$count ")
        return temp
    }

    if (data < temp.value) {
        temp.left = addB(temp.left, data, count+1)
    } else if (data > temp.value) {
        temp.right = addB(temp.right, data, count+1)
    }
    return temp
}


class TreeB(var value: Int){
    var left: TreeB? = null
    var right: TreeB? = null
}