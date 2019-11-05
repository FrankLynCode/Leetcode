fun main(){
    print( countCharacters(arrayOf("atd","sfw"),"whwat"))
}


fun countCharacters(words: Array<String>, chars: String): Int {

    val frequencyMap =  chars.groupingBy { it }.eachCount()
    var count = 0
    words.forEach unvalidword@ {word ->
        val frequencyCharact = word.groupingBy { it }.eachCount()
        frequencyCharact.forEach { charactCount ->
            if (!( frequencyMap.containsKey(charactCount.key) &&
                        frequencyMap.getOrDefault(charactCount.key,0) >= charactCount.value)){
                return@unvalidword
            }
        }
        count += word.length
    }

    /**
     * Test
     */
//    val valueList = ArrayList(frequencyMap.values)
//    println(valueList)
//    val keyList = ArrayList(frequencyMap.keys)
//    println(keyList)


    return count
}