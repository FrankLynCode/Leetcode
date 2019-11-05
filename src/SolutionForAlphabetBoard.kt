fun main() {
    print(alphabetBoardPath("zz"))
//    println(transferToUpDown(0))
//    println(transferRightLeft(0))
//    val t1 = arrayOf(0,0)
//    val t2 = arrayOf(1,2)
//    println(move(t1,t2))
//    println(t1.joinToString() == "0, 0")
}

fun alphabetBoardPath(target: String): String {
    val map = HashMap<Char, Array<Int>>()
    val board = arrayOf("abcde","fghij","klmno","pqrst","uvwxy","z")
    var path  = ""
    var getTarget = ""

    board.forEachIndexed { row : Int , alphaRow : String ->
        alphaRow.forEachIndexed {column : Int, alphaColumn : Char->
            map[alphaColumn] = arrayOf(row,column)
        }
    }

    var currentPostion = arrayOf(0,0)
/**
 * showTest
 */
//    val valueList = ArrayList(map.values)
//    for (i in valueList){
//        println(i.joinToString())
//    }
    while (getTarget != target ) {
        target.forEach {
            if (it == 'z' && currentPostion[0] != 5){
                path += move(currentPostion, map['u']!!)
                currentPostion = map['u']!!
            }
            path += move(currentPostion,map[it]!!)+"!"
            getTarget += it
            currentPostion = map[it]!!
        }
    }

    return path
}

fun move(currentPostion : Array<Int>, targetPostion : Array<Int>) : String{
    var pathString = ""
    val distanceRow  = currentPostion[0] - targetPostion[0]
    val distanceColumn = currentPostion[1] - targetPostion[1]
    pathString += transferToUpDown(distanceRow)
    pathString += transferRightLeft(distanceColumn)

    return pathString
}

fun transferToUpDown(steps : Int) : String{
    var result = ""
    var s = steps
    if (steps < 0 ){
        while (s < 0){
            s++
            result += "D"
        }
    }else {
        while (s>0){
            s--
            result += "U"
        }
    }
    return result
}

fun transferRightLeft(steps : Int) : String {
    var result = ""
    var s = steps
    if (steps < 0) {
        while (s < 0) {
            s++
            result += "R"
        }
    } else {
        while (s > 0) {
            s--
            result += "L"
        }
    }
    return result
}