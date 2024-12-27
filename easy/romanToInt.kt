class Solution {
    fun romanToInt(s: String): Int {
        var result: Int = 0; var i: Int = 0
        var curr: Int
        var post: Int
        val interpretation: IntArray = s.map{interpreter(it)}.toIntArray()

        while(i in interpretation.indices){
            if (i == interpretation.size - 1){
                result += interpretation[i]
                break
            }
            curr = interpretation[i]
            post = interpretation[i + 1]
            if (curr < post){
                result += post - curr
                i += 1
            }else{
                result += curr
            }
            i += 1
        }
        return result
    }

    private fun interpreter(c: Char): Int {
        return when(c){
            'I' -> 1
            'V' -> 5
            'X' -> 10
            'L' -> 50
            'C' -> 100
            'D' -> 500
            'M' -> 1000
            else -> 0
        }
    }
}