// Task 17.5: superclass for Image

package com.example.imglib

import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO

open class Bitmap(val filename: String) {
    val pixelData = try {
        ImageIO.read(File(filename))
    }
    catch (error: IOException) {
        BufferedImage(64, 64, BufferedImage.TYPE_INT_RGB)
    }

    val width get() = pixelData.width
    val height get() = pixelData.height
}
