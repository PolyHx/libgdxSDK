package io.lassondehacks.game.stages

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import io.lassondehacks.game.MainGame
import io.lassondehacks.game.entities.SpriteEntity
import io.lassondehacks.game.utils.Constants

class GameStage(var game: MainGame) : Stage() {

    var entity: SpriteEntity? = null

    init {
        this.entity = SpriteEntity("oiseau.png");
    }

    override fun draw() {
        super.draw()
        batch.begin()

        entity?.draw(batch)

        batch.end()
    }

    override fun act(delta: Float) {
        super.act(delta)
        this.entity?.position?.set(Gdx.input.getX(0).toFloat(), Constants.HEIGHT - Gdx.input.getY(0).toFloat())
    }

    override fun dispose() {

    }

}
