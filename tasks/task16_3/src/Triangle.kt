// Task 16.3: Triangle class, a subclass of Shape

import java.awt.Color
import java.awt.Graphics2D
import java.awt.geom.Path2D

class Triangle(x: Int, y: Int, val width: Int, val height: Int, color: Color) : Shape(x, y, color) {
    override fun draw(context: Graphics2D) {
        val shape = Path2D.Float()
        shape.moveTo(x.toFloat(), y.toFloat())
        shape.lineTo((x + width).toFloat(), y.toFloat())
        shape.lineTo(x + 0.5f * width, (y + height).toFloat())
        shape.lineTo(x.toFloat(), y.toFloat())

        val oldColor = context.paint
        context.paint = color
        context.fill(shape)
        context.paint = Color.BLACK
        context.draw(shape)
        context.paint = oldColor
    }
}
