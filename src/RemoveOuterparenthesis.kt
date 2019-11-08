/**
 * Leetcode 1021
 * Input: "(()())(())"
 * Output: "()()()"
 * Note:
 * S.length <= 10000
 * S only include "(" or ")"
 * S is a valid parentheses string
 */
class Solution {
    fun removeOuterParentheses(S: String): String {
        var leftIndex = -1
        var rightIndex = -1
        var parents = ""
        var count = -1

        S.forEachIndexed{i,s ->
            when(s){
                '(' -> {
                    if(++count<2) leftIndex = i
                }
                ')' ->{
                    if(--count>-1 || rightIndex == -1) rightIndex = i
                }
            }
            if(count == -1) {
                parents += S.substring(leftIndex, rightIndex)
                rightIndex = -1
            }
        }
        return parents
    }
}