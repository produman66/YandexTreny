fun main(){
}

class MySet{
    var setSize = 10
    val myset = Array<MutableList<Any>>(setSize) { mutableListOf<Any>() }

    fun add(x : Int){
        myset[x % setSize].add(x)
    }

    fun find(x: Int): Boolean{
        for (now in myset[x % setSize]){
            if (now == x){
                return true
            }
        }
        return false
    }

    fun delete(x: Int){
        val xlist = myset[x % setSize]
        for (i in 0 until xlist.size){
            if (xlist[i] == x){
                var temp =  xlist[i]
                xlist[i] = xlist[xlist.size - 1]
                xlist[xlist.size - 1] = temp
                xlist.removeLast()
                return
            }
        }
    }
}