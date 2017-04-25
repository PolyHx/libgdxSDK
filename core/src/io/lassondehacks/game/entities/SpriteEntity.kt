package io.lassondehacks.game.entities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

class SpriteEntity(texturePath: String) {

    var position: Vector2 = Vector2()
        get
        set
    var origin: Vector2 = Vector2()
        get
        set
    var bounds: Rectangle = Rectangle()
        get
        set
    var sprite: Sprite? = null

    init {
        this.sprite = Sprite(Texture(Gdx.files.internal(texturePath)))
        this.origin = Vector2(this.sprite?.texture?.width!!.toFloat() / 2f, this.sprite?.texture?.height!!.toFloat() / 2f)
        this.bounds = Rectangle()
    }

    fun draw(batch: Batch) {
        this.bounds = Rectangle(this.position.x, this.position.y, this.sprite?.width!!, this.sprite?.height!!)

        this.sprite?.setPosition(this.position.x - this.origin.x, this.position.y - this.origin.y)
        this.sprite?.draw(batch)
    }
}