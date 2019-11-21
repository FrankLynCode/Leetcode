/**
 * Example 1:


Input: n = 2, m = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix will be [[1,3,1],[1,3,1]] which contains 6 odd numbers.
 */
fun main(args: Array<String>) {
    println(oddCells(2, 3, arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))))
}

fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int {
    var result = 0
    var matrix = Array(n,init = {IntArray(m,init = {0})})
    indices.forEach { cell->
        matrix[cell[0]].forEachIndexed { index, _ ->
            ++matrix[cell[0]][index]
        }

        matrix.forEachIndexed { index, _ ->
            ++matrix[index][cell[1]]
        }
    }
    matrix.forEach { row ->
        row.forEach { cell ->
            if (cell%2 != 0)
                result++
        }
    }
    return result
}