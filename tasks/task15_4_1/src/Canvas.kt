// Task 15.4.1: Canvas class

import java.awt.Dimension
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.RenderingHints
import javax.swing.JComponent

class Canvas(val picture: Picture) : JComponent() {
    init {
        preferredSize = Dimension(400, 400)
    }

    override fun paintComponent(context: Graphics?) {
        super.paintComponent(context)
        val ctx = context as Graphics2D
        ctx.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
        ctx.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR)
        picture.draw(ctx)
    }
}
