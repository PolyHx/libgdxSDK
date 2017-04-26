package io.polyhx.utils

import com.badlogic.gdx.utils.TimeUtils

class Clock {
    private var lastTimeMs: Long = 0

    init {
        this.lastTimeMs = TimeUtils.millis()
    }

    val elapsedTime: Float
        get() = (TimeUtils.millis() - lastTimeMs) / 1000f

    fun restart(): Float {
        val elapsedTime = elapsedTime
        lastTimeMs = TimeUtils.millis()
        return elapsedTime
    }
}