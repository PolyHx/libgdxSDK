package io.polyhx.stages

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.scenes.scene2d.Actor
import com.badlogic.gdx.scenes.scene2d.Stage
import io.polyhx.MainGame
import io.polyhx.entities.AnimatedSpriteEntity
import io.polyhx.entities.SpriteEntity
import io.polyhx.utils.Constants

class GameStage(var game: MainGame) : Stage() {

    var entity: SpriteEntity? = null

    init {
        this.entity = AnimatedSpriteEntity("oiseaux.png", 2, 4)
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
