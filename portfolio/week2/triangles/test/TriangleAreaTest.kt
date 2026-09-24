// Tests for triangleArea()
// DO NOT ALTER ANYTHING IN THIS FILE!

import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleAreaTest {
    @Test
    fun `Area of {3,4,5} triangle is correct`() {
        val sides = Triangle(3.0, 4.0, 5.0)
        assertCloseTo(6.0, triangleArea(sides))
    }

    @Test
    fun `Area of {3,4,6} triangle is correct`() {
        val sides = Triangle(3.0, 4.0, 6.0)
        assertCloseTo(5.332682, triangleArea(sides))
    }

    @Test
    fun `Area of {4,13,15} triangle is correct`() {
        val sides = Triangle(4.0, 13.0, 15.0)
        assertCloseTo(24.0, triangleArea(sides))
    }

    @Test
    fun `Area in degenerate case is zero`() {
        val sides = Triangle(3.0, 1.5, 1.5)
        assertCloseTo(0.0, triangleArea(sides))
    }

    @Test
    fun `Area in imaginary case is NaN`() {
        val sides = Triangle(3.0, 1.0, 1.0)
        assertEquals(Double.NaN, triangleArea(sides))
    }
}
