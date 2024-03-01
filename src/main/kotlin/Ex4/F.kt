package Ex4



fun main(){
    val map = mutableMapOf<String, MutableMap<String, Long>>()

    generateSequence { readLine() }.forEach { line ->
        if (line.isNotBlank()) {
            val (name, product, cash) = line.trim().split(" ")
            map.getOrPut(name) { mutableMapOf() }
                .merge(product, cash.toLong()) { oldValue, newValue -> oldValue + newValue }

        } else {
            return@forEach
        }
    }
    val result = map.toSortedMap()

    result.forEach { (key, value) ->
        println("$key:")
        value.toSortedMap().forEach { (innerKey, innerValue) ->
            println("$innerKey $innerValue")
        }
    }
}


