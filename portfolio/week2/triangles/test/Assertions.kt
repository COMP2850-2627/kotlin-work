// Helper functions for unit tests
// DO NOT ALTER ANYTHING IN THIS FILE!

import kotlin.test.assertEquals

const val tolerance = 0.000001

fun assertCloseTo(expected: Double, actual: Double) = assertEquals(expected, actual, tolerance)
