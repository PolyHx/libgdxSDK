package io.lassondehacks.game.stages

import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import io.lassondehacks.game.MainGame

/**
 * Created by richerarc on 2017-04-21.
 */

class GameStage(var game: MainGame) : Stage() {

    var actor: Actor? = null

    init {
        this.actor = Actor()
        this.addActor(this.actor)
    }

    override fun draw() {
        super.draw()
    }

    override fun act(delta: Float) {
        super.act(delta)
    }

    override fun dispose() {

    }

}
