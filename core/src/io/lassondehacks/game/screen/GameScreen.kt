package io.lassondehacks.game.screen

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.Screen
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.scenes.scene2d.Stage
import io.lassondehacks.game.MainGame
import io.lassondehacks.game.stages.GameStage

/**
 * Created by richerarc on 2017-04-21.
 */
class GameScreen(var game: MainGame) : Screen {

    private var gameStage: GameStage? = null

    init {
        this.gameStage = GameStage(game)
    }

    override fun show() {

    }

    override fun render(delta: Float) {
        Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

        this.gameStage?.draw()
    }

    override fun resize(width: Int, height: Int) {

    }

    override fun pause() {

    }

    override fun resume() {

    }

    override fun hide() {

    }

    override fun dispose() {
        this.gameStage?.dispose()
    }
}
