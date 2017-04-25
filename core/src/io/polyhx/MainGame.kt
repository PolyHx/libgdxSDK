package io.polyhx

import com.badlogic.gdx.Game
import io.polyhx.screen.GameScreen

class MainGame : Game() {

    override fun create() {
        setScreen(GameScreen(this))
    }
}
