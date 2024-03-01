package Ex8

fun main(){
    val list = readLine()!!.split(" ").map{ it.toInt() }
    if (list[0] != 0){
        print(0)
        return
    }
    val tr = Tree(list[0])
    for (i in 1 until list.size - 1){
        add(tr, list[i])
    }
    height(tr)
}

private fun add(root: Tree?, data: Int): Tree {
    var temp = root
    if (temp == null) {
        temp = Tree(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = add(temp.left, data)
    } else if (data > temp.value) {
        temp.right = add(temp.right, data)
    }
    return temp
}

fun height(tree: Tree){
    var count = 0
    var ls = mutableListOf<Tree>()
    ls.add(tree)

    while (ls.size != 0){
        val pr = mutableListOf<Tree>()
        for (i in ls.indices){
            if (ls[i].right != null){
                pr.add(ls[i].right!!)
            }
            if (ls[i].left != null){
                pr.add(ls[i].left!!)
            }
        }
        count ++
        ls = pr
    }
    print(count)

}

class Tree(var value: Int){
    var left: Tree? = null
    var right: Tree? = null
}