// Task 15.4.2: Rectangle class, a subclass of Shape

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Rectangle2D

class Rectangle(x: Int, y: Int, val width: Int, val height: Int, color: Color) : Shape(x, y, color) {
    override fun draw(context: Graphics2D) {
        val shape = Rectangle2D.Float(x.toFloat(), y.toFloat(), width.toFloat(), height.toFloat())
        val oldColor = context.paint
        context.paint = color
        context.fill(shape)
        context.paint = Color.BLACK
        context.draw(shape)
        context.paint = oldColor
    }
}
