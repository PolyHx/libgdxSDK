package io.polyhx.engine.utils

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.math.Vector2
import java.util.*

class Mouse {

    companion object {
        @JvmStatic
        fun getPosition(): Vector2 {
            return Vector2(Gdx.input.getX(0).toFloat(), Constants.HEIGHT - Gdx.input.getY(0).toFloat())
        }
    }
}
