// Task 16.3: abstract Shape class

import java.awt.Color
import java.awt.Graphics2D

abstract class Shape(val x: Int, val y: Int, val color: Color) {
    abstract fun draw(context: Graphics2D)
}
