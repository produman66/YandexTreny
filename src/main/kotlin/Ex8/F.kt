package Ex8

fun main(){
    val ls = readLine()!!.split(" ").map { it.toInt() }

    val root = TreeF(ls[0])

    for (i in 1 until ls.size - 1){
        addF(root, ls[i])
    }
    obhodF(root)


}

fun addF(root: TreeF?, data: Int): TreeF {
    var temp = root
    if (temp == null) {
        temp = TreeF(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addF(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addF(temp.right, data)
    }

    return temp
}

fun obhodF(root: TreeF? ){
    if (root == null){
        return
    }

    obhodF(root.left)
    if (root.left != null && root.right != null){
        println(root.value)
    }
    obhodF(root.right)

    return
}


class TreeF(var value: Int){
    var left: TreeF? = null
    var right: TreeF? = null
}
