package io.polyhx.engine.entities

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.Color

class Label : Entity() {
    var font: BitmapFont = BitmapFont(Gdx.files.internal("font.fnt"), Gdx.files.internal("font.png"), false)

    var text: String = ""
        get
        set

    var color: Color = Color.BLACK
        get
        set

    fun setFontScale(scale: Float){
        this.font.data.scale(scale)

    }

    override fun draw(batch: Batch) {
        this.font.color = this.color
        this.font.draw(batch, this.text, this.position.x, this.position.y)
    }

}