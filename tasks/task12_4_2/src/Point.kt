// Task 12.4.2: Point class with overridden toString()

import kotlin.math.hypot

class Point(val x: Double, val y: Double) {
    fun distance() = hypot(x, y)
    fun distanceTo(p: Point) = hypot(x - p.x, y - p.y)
    // Add an overridden toString() method here
}
