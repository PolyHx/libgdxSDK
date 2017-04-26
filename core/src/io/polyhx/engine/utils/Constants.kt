package io.polyhx.engine.utils

import com.badlogic.gdx.math.Rectangle

class Constants {
    companion object {
        @JvmField
        val WIDTH = 1024
        @JvmField
        val HEIGHT = 720
        @JvmField
        val screenBounds = Rectangle(0f, 0f, WIDTH.toFloat(), HEIGHT.toFloat())
    }
}
