package io.polyhx.engine.utils

import com.badlogic.gdx.utils.TimeUtils

class Clock {
    private var lastTimeMs: Long = 0

    init {
        this.lastTimeMs = com.badlogic.gdx.utils.TimeUtils.millis()
    }

    val elapsedTime: Float
        get() = (com.badlogic.gdx.utils.TimeUtils.millis() - lastTimeMs) / 1000f

    fun restart(): Float {
        val elapsedTime = elapsedTime
        lastTimeMs = com.badlogic.gdx.utils.TimeUtils.millis()
        return elapsedTime
    }
}