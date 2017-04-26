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
    var textureRegionW: Int
    var textureRegionH: Int

    init {
        var texture = Texture(Gdx.files.internal(texturePath))
        var textures: Array<TextureRegion> = Array()
        textureRegionW = texture.width / columnCount
        textureRegionH = texture.height / rowCount
        for (i in 0..rowCount * columnCount - 1) {
            var x: Int = i % columnCount
            var y: Int = Math.floor(i / columnCount.toDouble()).toInt()

            textures.add(TextureRegion(texture, x * textureRegionW, y * textureRegionH, textureRegionW, textureRegionH))
        }
        animation = Animation(0.05f, textures, Animation.PlayMode.LOOP)
        this.origin = Vector2(textureRegionW.toFloat() / 2, textureRegionH.toFloat() / 2)
        this.sprite?.setSize(textureRegionW.toFloat(), textureRegionH.toFloat())
    }

    override fun draw(batch: Batch) {
        super.draw(batch)
        var frame = animation?.getKeyFrame(this.clock.elapsedTime)
        this.sprite?.setRegion(frame!!)
    }
}
