package io.polyhx.engine.screen

import io.polyhx.engine.stages.GameStage
import io.polyhx.engine.MainGame

class GameScreen(var game: MainGame) : com.badlogic.gdx.Screen {

    private var gameStage: GameStage? = null

    init {
        this.gameStage = GameStage(game)
    }

    override fun show() {

    }

    override fun render(delta: Float) {
        com.badlogic.gdx.Gdx.gl.glClearColor(1f, 1f, 1f, 1f)
        com.badlogic.gdx.Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT)

        this.gameStage?.draw()
        this.gameStage?.act(delta)
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
