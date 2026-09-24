// Tests for isValidTriangle()
// DO NOT ALTER ANYTHING IN THIS FILE!

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidTriangleTest {
    @Test
    fun `{3,4,5} is a valid triangle`() {
        val sides = Triangle(3.0, 4.0, 5.0)
        assertTrue(isValidTriangle(sides))
    }

    @Test
    fun `{3,4,6} is a valid triangle`() {
        val sides = Triangle(3.0, 4.0, 6.0)
        assertTrue(isValidTriangle(sides))
    }

    @Test
    fun `{4,13,15} is a valid triangle`() {
        val sides = Triangle(4.0, 13.0, 15.0)
        assertTrue(isValidTriangle(sides))
    }

    @Test
    fun `Degenerate case is not a valid triangle`() {
        val sides = Triangle(3.0, 1.5, 1.5)
        assertFalse(isValidTriangle(sides))
    }

    @Test
    fun `Imaginary case is not a valid triangle`() {
        val sides = Triangle(3.0, 1.0, 1.0)
        assertFalse(isValidTriangle(sides))
    }
}
