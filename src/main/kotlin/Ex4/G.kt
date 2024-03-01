package Ex4
fun main(){
    val map = mutableMapOf<String, Long>()
    var ans = mutableListOf<String>()
    while (true) {
        val line = readLine() ?: break
        if (line.isBlank()) break
        val input = line.trim().split(" ")
        if (input[0] == "TRANSFER"){
            val name = input[1]
            val name2 = input[2]
            val money = input[3]
            if (!map.containsKey(name)){
                map[name] = 0
            }
            if (!map.containsKey(name2)){
                map[name2] = 0
            }
            map[name2] = map[name2]!! + money.toLong()
            map[name] = map[name]!! - money.toLong()
        }
        else if (input[0] == "INCOME"){
            val p = input[1].toLong()

            map.forEach { (key, value) ->
                if (value > 0) {
                    map[key] = (value *  (1 + p/100.0)).toLong()
                }
            }
        }
        else if (input[0] == "BALANCE"){
            val name = input[1]
            if (!map.containsKey(name)){
                ans.add("ERROR")
            }else {
                ans.add(map[name].toString())
            }

        }
        else {
            val command = input[0]
            val name = input[1]
            val money = input[2].toLong()
            if (!map.containsKey(name)){
                map[name] = 0
            }
            if (command == "DEPOSIT"){
                map[name] = map[name]!! + money
            }
            else if (command == "WITHDRAW"){
                map[name] = map[name]!! - money
            }
        }

    }
    print(ans.joinToString("\n"))

}



