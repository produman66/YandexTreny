package Ex8

fun main(){
    var ls = readLine()!!.split(" ").map{ it.toInt() }

    val tr = TreeC(ls[0])
    for (i in 1 until ls.size - 1){
        addC(tr, ls[i])
    }
    val ans = mutableListOf<Int>()

    fun findMax(tree: TreeC?){
        if (tree == null){
            return
        }

        findMax(tree.right)
        ans.add(tree.value)
        findMax(tree.left)

        return
    }

    findMax(tr)
    print(ans[1])


}

fun addC(root: TreeC?, data: Int): TreeC {
    var temp = root
    if (temp == null) {
        temp = TreeC(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addC(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addC(temp.right, data)
    }
    return temp
}




class TreeC(var value: Int){
    var left: TreeC? = null
    var right: TreeC? = null
}