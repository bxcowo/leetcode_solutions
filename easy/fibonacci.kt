package easy

fun fib(n: Int): Int {
    return when(n){
        0 -> 0
        1 -> 1
        else -> {
            val results: IntArray = IntArray(n)
            results[0] = 0
            results[1] = 1
            for (i in 2..<results.size) {
                results[i] = results[i - 1] + results[i - 2]
            }
            results[n-1] + results[n-2]
        }
    }
}