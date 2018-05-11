package io.polyhx.engine.utils

import com.badlogic.gdx.Gdx

class Keybord {
    companion object {
        @JvmStatic
        fun isKeyPressed(button: Int): Boolean {
            return Gdx.input.isKeyPressed(button)
        }
        @JvmStatic
        fun isKeyJustPressed(button: Int): Boolean {
            return Gdx.input.isKeyJustPressed(button)
        }
    }
}