package io.polyhx.engine.stages

import com.badlogic.gdx.scenes.scene2d.Stage
import io.polyhx.Game
import io.polyhx.engine.MainGame

class GameStage(var game: MainGame) : Stage() {

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
