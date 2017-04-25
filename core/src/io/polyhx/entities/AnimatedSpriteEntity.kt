package io.polyhx.entities

import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation

class AnimatedSpriteEntity(texturePath: String) : SpriteEntity(texturePath) {

    var animation: Animation<Texture>? = null

    init {
        animation = Animation(0.15f, null)
    }
}
