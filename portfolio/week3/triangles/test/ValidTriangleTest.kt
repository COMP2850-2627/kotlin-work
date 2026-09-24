// Tests for isValidTriangle()
// DO NOT ALTER ANYTHING IN THIS FILE!

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("Unused")
class ValidTriangleTest : FreeSpec({
    "{3,4,5} is a valid triangle" {
        val sides = Triangle(3.0, 4.0, 5.0)
        isValidTriangle(sides) shouldBe true
    }

    "{3,4,6} is a valid triangle" {
        val sides = Triangle(3.0, 4.0, 6.0)
        isValidTriangle(sides) shouldBe true
    }

    "{4,13,15} is a valid triangle" {
        val sides = Triangle(4.0, 13.0, 15.0)
        isValidTriangle(sides) shouldBe true
    }

    "Degenerate case is not a valid triangle" {
        val sides = Triangle(3.0, 1.5, 1.5)
        isValidTriangle(sides) shouldBe false
    }

    "Imaginary case is not a valid triangle" {
        val sides = Triangle(3.0, 1.0, 1.0)
        isValidTriangle(sides) shouldBe false
    }
})
