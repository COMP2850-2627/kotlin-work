// Task 16.3: main program

import java.awt.BorderLayout
import java.awt.Color
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.SwingUtilities

fun main() = SwingUtilities.invokeLater {
    val pic = Picture().apply {
        add(Rectangle(45, 30, 30, 30, Color.DARK_GRAY))
        add(Rectangle(285, 150, 90, 65, Color.BLUE))
        add(Circle(100, 185, 50, Color.MAGENTA))
        add(Rectangle(15, 120, 25, 60, Color.GREEN))
        add(Circle(290, 110, 60, Color.LIGHT_GRAY))
        add(Circle(165, 320, 35, Color.YELLOW))
        add(Triangle(185, 200, 70, 55, Color.RED))
    }

    val canvas = Canvas(pic)

    JFrame("Picture App v3").apply {
        isVisible = true
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        add(JScrollPane(canvas), BorderLayout.CENTER)
        pack()
    }
}
