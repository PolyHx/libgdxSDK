package io.polyhx.engine.entities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

open class SpriteEntity(texturePath: String) {

    var position: com.badlogic.gdx.math.Vector2 = com.badlogic.gdx.math.Vector2()
        get
        set
    var origin: com.badlogic.gdx.math.Vector2 = com.badlogic.gdx.math.Vector2()
        get
        set
    var bounds: com.badlogic.gdx.math.Rectangle = com.badlogic.gdx.math.Rectangle()
        get
        set
    var sprite: com.badlogic.gdx.graphics.g2d.Sprite? = null

    init {
        this.sprite = com.badlogic.gdx.graphics.g2d.Sprite(com.badlogic.gdx.graphics.Texture(com.badlogic.gdx.Gdx.files.internal(texturePath)))
        this.origin = com.badlogic.gdx.math.Vector2(this.sprite?.texture?.width!!.toFloat() / 2f, this.sprite?.texture?.height!!.toFloat() / 2f)
        this.bounds = com.badlogic.gdx.math.Rectangle()
    }

    open fun draw(batch: com.badlogic.gdx.graphics.g2d.Batch) {
        this.bounds = com.badlogic.gdx.math.Rectangle(this.position.x - this.origin.x, this.position.y - this.origin.y, this.sprite?.width!!, this.sprite?.height!!)

        this.sprite?.setPosition(this.position.x - this.origin.x, this.position.y - this.origin.y)
        this.sprite?.draw(batch)
    }
}