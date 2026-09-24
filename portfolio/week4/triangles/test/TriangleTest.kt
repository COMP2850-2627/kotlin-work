// Tests for Triangle class
// DO NOT ALTER ANYTHING IN THIS FILE!

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.assertSoftly
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.doubles.plusOrMinus

const val tolerance = 0.000001

@Suppress("Unused")
class TriangleTest : FreeSpec({
    val t1 = Triangle(3.0, 4.0, 5.0)
    val t2 = Triangle(3.0, 4.0, 6.0)
    val t3 = Triangle(4.0, 13.0, 15.0)

    "{3,4,5} triangle created correctly" {
        assertSoftly {
            t1.sideA shouldBe (3.0 plusOrMinus tolerance)
            t1.sideB shouldBe (4.0 plusOrMinus tolerance)
            t1.sideC shouldBe (5.0 plusOrMinus tolerance)
        }
    }

    "{4,13,15} triangle created correctly" {
        assertSoftly {
            t3.sideA shouldBe (4.0 plusOrMinus tolerance)
            t3.sideB shouldBe (13.0 plusOrMinus tolerance)
            t3.sideC shouldBe (15.0 plusOrMinus tolerance)
        }
    }

    "Cannot create a degenerate triangle" {
        shouldThrow<IllegalArgumentException> {
            Triangle(3.0, 1.5, 1.5)
        }
    }

    "Cannot create an imaginary triangle" {
        shouldThrow<IllegalArgumentException> {
            Triangle(3.0, 1.0, 1.0)
        }
    }

    "Perimeter of {3,4,5} triangle is correct" {
        t1.perimeter shouldBe (12.0 plusOrMinus tolerance)
    }

    "Perimeter of {3,4,6} triangle is correct" {
        t2.perimeter shouldBe (13.0 plusOrMinus tolerance)
    }

    "Perimeter of {4,13,15} triangle is correct" {
        t3.perimeter shouldBe (32.0 plusOrMinus tolerance)
    }

    "Semi-perimeter of {3,4,5} triangle is correct" {
        t1.semiPerimeter shouldBe (6.0 plusOrMinus tolerance)
    }

    "Semi-perimeter of {3,4,6} triangle is correct" {
        t2.semiPerimeter shouldBe (6.5 plusOrMinus tolerance)
    }

    "Semi-perimeter of {4,13,15} triangle is correct" {
        t3.semiPerimeter shouldBe (16.0 plusOrMinus tolerance)
    }

    "Area of {3,4,5} triangle is correct" {
        t1.area shouldBe (6.0 plusOrMinus tolerance)
    }

    "Area of {3,4,6} triangle is correct" {
        t2.area shouldBe (5.332682 plusOrMinus tolerance)
    }

    "Area of {4,13,15} triangle is correct" {
        t3.area shouldBe (24.0 plusOrMinus tolerance)
    }

    "String representation of {3,4,5} triangle is correct" {
        t1.toString() shouldBe "Triangle(3.0, 4.0, 5.0)"
    }

    "String representation of {4,13,15} triangle is correct" {
        t3.toString() shouldBe "Triangle(4.0, 13.0, 15.0)"
    }
})
