// Tests for triangleArea()
// DO NOT ALTER ANYTHING IN THIS FILE!

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.doubles.plusOrMinus

const val tolerance = 0.000001

@Suppress("Unused")
class TriangleAreaTest : FreeSpec({
    "Area of {3,4,5} triangle is correct" {
        val sides = Triangle(3.0, 4.0, 5.0)
        triangleArea(sides) shouldBe (6.0 plusOrMinus tolerance)
    }

    "Area of {3,4,6} triangle is correct" {
        val sides = Triangle(3.0, 4.0, 6.0)
        triangleArea(sides) shouldBe (5.332682 plusOrMinus tolerance)
    }

    "Area of {4,13,15} triangle is correct" {
        val sides = Triangle(4.0, 13.0, 15.0)
        triangleArea(sides) shouldBe (24.0 plusOrMinus tolerance)
    }

    "Exception thrown for degenerate case" {
        shouldThrow<IllegalArgumentException> {
            triangleArea(Triangle(3.0, 1.5, 1.5))
        }
    }

    "Exception thrown for imaginary case" {
        shouldThrow<IllegalArgumentException> {
            triangleArea(Triangle(3.0, 1.0, 1.0))
        }
    }
})
