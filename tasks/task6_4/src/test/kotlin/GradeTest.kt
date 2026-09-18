// Task 6.4: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    @Test
    fun `Mark of 0 gives a Fail`() {
        assertEquals("Fail", grade(0))
    }

    @Test
    fun `Mark of 20 gives a Fail`() {
        assertEquals("Fail", grade(20))
    }

    @Test
    fun `Mark of 39 gives a Fail`() {
        assertEquals("Fail", grade(39))
    }

    @Test
    fun `Mark of 40 gives a Pass`() {
        assertEquals("Pass", grade(40))
    }

    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }

    @Test
    fun `Mark of 69 gives a Pass`() {
        assertEquals("Pass", grade(69))
    }

    @Test
    fun `Mark of 70 gives a Distinction`() {
        assertEquals("Distinction", grade(70))
    }

    @Test
    fun `Mark of 85 gives a Distinction`() {
        assertEquals("Distinction", grade(85))
    }

    @Test
    fun `Mark of 100 gives a Distinction`() {
        assertEquals("Distinction", grade(100))
    }

    @Test
    fun `Mark of -1 isn't a valid grade`() {
        assertEquals("?", grade(-1))
    }

    @Test
    fun `Mark of -5 isn't a valid grade`() {
        assertEquals("?", grade(-5))
    }

    @Test
    fun `Mark of 101 isn't a valid grade`() {
        assertEquals("?", grade(101))
    }

    @Test
    fun `Mark of 105 isn't a valid grade`() {
        assertEquals("?", grade(105))
    }
}
