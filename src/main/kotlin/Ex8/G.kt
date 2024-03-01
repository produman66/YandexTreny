package Ex8

fun main(){
    val ls = readLine()!!.split(" ").map { it.toInt() }

    val root = TreeG(ls[0])

    for (i in 1 until ls.size - 1){
        addG(root, ls[i])
    }
    obhodG(root)


}

fun addG(root: TreeG?, data: Int): TreeG {
    var temp = root
    if (temp == null) {
        temp = TreeG(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addG(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addG(temp.right, data)
    }

    return temp
}

fun obhodG(root: TreeG? ){
    if (root == null){
        return
    }

    obhodG(root.left)
    if ((root.left != null && root.right == null) || (root.left == null && root.right != null) ){
        println(root.value)
    }
    obhodG(root.right)

    return
}


class TreeG(var value: Int){
    var left: TreeG? = null
    var right: TreeG? = null
}