fun main(){
//    println( countCharacters(arrayOf("atd","sfw"),"whwat"))
//    println(countCharacters)
    println(test())
}

/**
 * Solution 1
 */
//fun countCharacters(words: Array<String>, chars: String): Int {
//
//    val frequencyMap =  chars.groupingBy { it }.eachCount()
//    var count = 0
//    words.forEach unvalidword@ {word ->
//        val frequencyCharact = word.groupingBy { it }.eachCount()
//        frequencyCharact.forEach { charactCount ->
//            if (!( frequencyMap.containsKey(charactCount.key) &&
//                        frequencyMap.getOrDefault(charactCount.key,0) >= charactCount.value)){
//                return@unvalidword
//            }
//        }
//        count += word.length
//    }
//
//return count
//}
    /**
     * Solution 2
     */
fun countCharacters(words: Array<String>, chars: String): Int {
    fun good(s: String, t: String): Boolean = ('a'..'z').all { ch ->
        s.count { it == ch } <= t.count {it == ch}
    }
    return words.sumBy { if (good(it, chars)) it.length else 0 }
}


val zeroToTen = 0..10


fun test() :Boolean = ('a'..'z').all {
    println(it)
    it in 'a'..'z'

}

    /**
     * Test
     */
//    val valueList = ArrayList(frequencyMap.values)
//    println(valueList)
//    val keyList = ArrayList(frequencyMap.keys)
//    println(keyList)

