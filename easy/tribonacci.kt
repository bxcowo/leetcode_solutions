package easy

fun tribonacci(n: Int): Int {
    return when(n){
        0 -> 0
        1 -> 1
        2 -> 1
        else -> {
            val results: IntArray = IntArray(n)
            results[0] = 0
            results[1] = 1
            results[2] = 1
            for (i in 3..<results.size) {
                results[i] = results[i - 1] + results[i - 2] + results[i - 3]
            }
            results[n - 1] + results[n - 2] + results[n - 3]
        }
    }
}