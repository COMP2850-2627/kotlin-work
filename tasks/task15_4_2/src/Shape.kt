// Task 15.4.2: Shape class, a superclass for different kinds of shape

import java.awt.Color
import java.awt.Graphics2D

open class Shape(val x: Int, val y: Int, val color: Color) {
    open fun draw(context: Graphics2D) {
        // What goes in here?
    }
}
