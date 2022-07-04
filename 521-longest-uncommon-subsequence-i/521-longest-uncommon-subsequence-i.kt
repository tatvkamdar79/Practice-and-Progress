class Solution {
    fun findLUSlength(a: String, b: String): Int {
        return when {
            a.length == b.length -> if (a == b) -1 else a.length
            else -> Math.max(a.length, b.length)
        }
    }
}