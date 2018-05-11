package io.polyhx.engine.entities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.badlogic.gdx.math.Vector2
import com.badlogic.gdx.utils.Array
import io.polyhx.engine.utils.Clock

class AnimatedSpriteEntity(texturePath: String, rowCount: Int, columnCount: Int) : SpriteEntity(texturePath) {

    var animation: Animation<TextureRegion>? = null
    var clock: Clock = Clock()

    init {
        setTexture(texturePath, rowCount, columnCount);
    }

    override fun draw(batch: Batch) {
        super.draw(batch)
        val frame = animation?.getKeyFrame(this.clock.elapsedTime)
        this.sprite?.setRegion(frame!!)
    }

    fun setTexture(texturePath: String, rowCount: Int, columnCount: Int) {
        val texture = Texture(Gdx.files.internal(texturePath))
        val textures: Array<TextureRegion> = Array()
        textureRegionW = texture.width / columnCount
        textureRegionH = texture.height / rowCount
        for (i in 0 until rowCount * columnCount) {
            val x: Int = i % columnCount
            val y: Int = Math.floor(i / columnCount.toDouble()).toInt()

            textures.add(TextureRegion(texture, x * textureRegionW, y * textureRegionH, textureRegionW, textureRegionH))
        }
        animation = Animation(0.05f, textures, Animation.PlayMode.LOOP)
        this.origin = Vector2(Math.floor((textureRegionW.toFloat() / 2).toDouble()).toFloat(),
                Math.floor((textureRegionH.toFloat() / 2).toDouble()).toFloat())
        this.sprite?.setSize(textureRegionW.toFloat(), textureRegionH.toFloat())
    }

    fun pause() {
        animation?.frameDuration = 0.0f
    }

    fun play() {
        animation?.frameDuration = 0.05f
    }
}
