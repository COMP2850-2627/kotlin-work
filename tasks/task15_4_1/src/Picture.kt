// Task 15.4.1: Picture class, representing a collection of shapes

import java.awt.Graphics2D

class Picture {
    private val shapes = mutableListOf<Shape>()

    fun add(shape: Shape) = shapes.add(shape)

    fun draw(context: Graphics2D) = shapes.forEach { shape ->
        // Note: this is a bad approach...
        when {
            shape is Circle -> shape.draw(context)
            shape is Rectangle -> shape.draw(context)
            // ...because we would need to add a new branch here
            // each time we added a new type of shape
        }
    }
}
