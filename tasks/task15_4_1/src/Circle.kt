// Task 15.4.1: Circle class, a subclass of Shape

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Ellipse2D

class Circle(x: Int, y: Int, val radius: Int, color: Color) : Shape(x, y, color) {
    fun draw(context: Graphics2D) {
        val size = 2.0f * radius
        val cornerX = (x - radius).toFloat()
        val cornerY = (y - radius).toFloat()
        val shape = Ellipse2D.Float(cornerX, cornerY, size, size)

        val oldColor = context.paint
        context.paint = color
        context.fill(shape)
        context.paint = Color.BLACK
        context.draw(shape)
        context.paint = oldColor
    }
}
