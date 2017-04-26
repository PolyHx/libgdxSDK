package io.polyhx.engine.entities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2
import kotlin.coroutines.experimental.EmptyCoroutineContext.plus

open class SpriteEntity(texturePath: String) {

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

    var velocity: Vector2 = Vector2()
        get
        set

    init {
        this.sprite = Sprite(Texture(Gdx.files.internal(texturePath)))
        this.origin = Vector2(this.sprite?.texture?.width!!.toFloat() / 2f, this.sprite?.texture?.height!!.toFloat() / 2f)
        this.bounds = Rectangle()
    }

    open fun draw(batch: Batch) {
        this.bounds = Rectangle(this.position.x - this.origin.x, this.position.y - this.origin.y, this.sprite?.width!!, this.sprite?.height!!)

        this.position.add(velocity.x * Gdx.graphics.deltaTime, velocity.y * Gdx.graphics.deltaTime)
        this.sprite?.setPosition(this.position.x - this.origin.x, this.position.y - this.origin.y)
        this.sprite?.draw(batch)
    }

    open fun setWrapRepeat() {
        this.sprite?.texture?.setWrap(Texture.TextureWrap.Repeat, Texture.TextureWrap.ClampToEdge)
    }
}
