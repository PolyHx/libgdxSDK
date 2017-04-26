package io.polyhx.engine.stages

import io.polyhx.Game
import io.polyhx.engine.MainGame

class GameStage(var game: MainGame) : com.badlogic.gdx.scenes.scene2d.Stage() {

    var theGame = Game()

    override fun draw() {
        super.draw()
        batch.begin()
        theGame.draw(batch)
        batch.end()
    }

    override fun act(delta: Float) {
        super.act(delta)
        theGame.act(delta)
    }

    override fun dispose() {

    }

}
