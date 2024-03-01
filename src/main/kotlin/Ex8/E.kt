package Ex8

fun main(){
    val ls = readLine()!!.split(" ").map { it.toInt() }

    val root = TreeE(ls[0])

    for (i in 1 until ls.size - 1){
        addE(root, ls[i])
    }

    obhod(root)


}


fun addE(root: TreeE?, data: Int): TreeE {
    var temp = root
    if (temp == null) {
        temp = TreeE(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addE(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addE(temp.right, data)
    }

    return temp
}


fun heightE(tree: TreeE): MutableList<Int>{
    var ls = mutableListOf<TreeE>()
    ls.add(tree)

    val ans = mutableListOf<Int>()

    while (ls.size != 0){
        val pr = mutableListOf<TreeE>()
        for (i in ls.indices){
            if (ls[i].right != null){
                pr.add(ls[i].right!!)
            }
            if (ls[i].left != null){
                pr.add(ls[i].left!!)
            }
            if (ls[i].left == null && ls[i].right == null){
                ans.add(ls[i].value)
            }
        }
        ls = pr
    }
    return ans
}

fun obhod(root: TreeE? ){
    if (root == null){
        return
    }
    if (root.left == null && root.right == null){
        println(root.value)
        return
    }

    obhod(root.left)
    obhod(root.right)

    return
}

class TreeE(var value: Int){
    var left: TreeE? = null
    var right: TreeE? = null
}
