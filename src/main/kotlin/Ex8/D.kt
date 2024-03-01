package Ex8

import java.lang.StringBuilder

fun main(){
    val str = StringBuilder()
    fun obhod(root: TreeD? ){
        if (root == null){
            return
        }

        obhod(root.left)
        str.append("${root.value}\n")
        obhod(root.right)

        return
    }
    val ls = readLine()!!.split(" ").map{ it.toInt() }
    var tr = TreeD(ls[0])
    for (i in 1 until ls.size - 1) {
        addD(tr, ls[i])
    }
    obhod(tr)

    print(str.toString())


}


fun addD(root: TreeD?, data: Int): TreeD {
    var temp = root
    if (temp == null) {
        temp = TreeD(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addD(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addD(temp.right, data)
    }
    return temp
}



class TreeD(var value: Int){
    var left: TreeD? = null
    var right: TreeD? = null
}