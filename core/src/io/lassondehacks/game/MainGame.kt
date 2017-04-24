package io.lassondehacks.game

import com.badlogic.gdx.Game
import io.lassondehacks.game.screen.GameScreen

class MainGame : Game() {

    override fun create() {
        setScreen(GameScreen(this))
    }
}
