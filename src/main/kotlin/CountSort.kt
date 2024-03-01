import java.util.Collections.max
import java.util.Collections.min
fun main(){
    val ls = mutableListOf<Int>()

    ls.add(2)
    ls.add(5)
    ls.add(3)
    ls.add(2)
    ls.add(2)
    ls.add(7)
    countSort(ls)
    print(ls)
}
fun countSort(ls: MutableList<Int>){
    val minVal = min(ls) // левая граница
    val maxVal = max(ls) // правая граница
    val k = (maxVal - minVal + 1) // Длина массива для
                                 // подсчета вхождений
    val count = IntArray(k){0}   // Массив, в котором подсчет
    for (now in ls){
        count[now - minVal] += 1  //Сколько раз вошел элемент
    }
    var nowpos = 0         //Текущий индекс массива,
                          //который сортируем

    for (value in 0 until k){     //Сортируем
        for (i in 0 until count[value]){
            ls[nowpos] = value + minVal
            nowpos += 1
        }
    }
}