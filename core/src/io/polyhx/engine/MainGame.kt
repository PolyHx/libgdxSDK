package io.polyhx.engine

import com.badlogic.gdx.Game
import io.polyhx.engine.screen.GameScreen

class MainGame : Game() {

    override fun create() {
        setScreen(GameScreen(this))
    }
}
