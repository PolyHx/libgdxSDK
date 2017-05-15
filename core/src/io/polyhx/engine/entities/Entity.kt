package io.polyhx.engine.entities

import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.math.Rectangle
import com.badlogic.gdx.math.Vector2

open class Entity {
    var position: Vector2 = Vector2()
        get
        set
    open fun draw(batch: Batch) {

    }
}