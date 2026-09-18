// Task 15.4.2: Picture class, representing a collection of shapes

import java.awt.Graphics2D

class Picture {
    private val shapes = mutableListOf<Shape>()

    fun add(shape: Shape) = shapes.add(shape)

    fun draw(context: Graphics2D) = shapes.forEach {
        // Polymorphic behaviour here: Picture invokes draw on each shape
        // without needing to check exactly what type of shape it is
        it.draw(context)
    }
}
