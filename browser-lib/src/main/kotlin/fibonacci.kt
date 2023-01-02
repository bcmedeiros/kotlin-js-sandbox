@file:OptIn(ExperimentalJsExport::class)

@JsExport
fun fibonacci(n: Int): Int {
    return when (n) {
        0 -> 0
        1 -> 1
        else -> fibonacci(n - 2) + fibonacci(n - 1) // dumb version for now
    }
}