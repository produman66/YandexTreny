package Ex8

import java.lang.Integer.max
import kotlin.math.abs

fun main(){
    val ls = readLine()!!.split(" ").map { it.toInt() }

    val root = TreeH(ls[0])

    for (i in 1 until ls.size - 1){
        addH(root, ls[i])
    }
    var ans = "YES"
    fun obhodH(root: TreeH?){
        if (root == null){
            return
        }
        if (abs(maxDepth(root.left) - maxDepth(root.right)) > 1){
            ans = "NO"
            return
        }


        obhodH(root.left)
        obhodH(root.right)


        return
    }

    obhodH(root)
    print(ans)

}

fun addH(root: TreeH?, data: Int): TreeH {
    var temp = root
    if (temp == null) {
        temp = TreeH(data)
        return temp
    }

    if (data < temp.value) {
        temp.left = addH(temp.left, data)
    } else if (data > temp.value) {
        temp.right = addH(temp.right, data)
    }

    return temp
}


fun maxDepth(root: TreeH?):Int{
    if (root == null){
        return 0
    }

    return 1 + max(maxDepth(root.left), maxDepth(root.right))
}

class TreeH(var value: Int){
    var left: TreeH? = null
    var right: TreeH? = null
}
