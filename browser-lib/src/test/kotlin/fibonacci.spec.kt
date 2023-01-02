import kotlin.test.Test
import kotlin.test.assertEquals

internal class FibonacciTest {
    @Test
    fun test0() {
        val r = fibonacci(0)
        assertEquals(0, r)
    }

    @Test
    fun test1() {
        val r = fibonacci(1)
        assertEquals(1, r)
    }

    @Test
    fun test2() {
        val r = fibonacci(2)
        assertEquals(1, r)
    }

    @Test
    fun test3() {
        val r = fibonacci(3)
        assertEquals(2, r)
    }

    @Test
    fun test4() {
        val r = fibonacci(4)
        assertEquals(3, r)
    }

    @Test
    fun test5() {
        val r = fibonacci(5)
        assertEquals(5, r)
    }

    @Test
    fun test21() {
        val r = fibonacci(21)
        assertEquals(10946, r)
    }
}