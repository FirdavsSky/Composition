package com.firdavs.android.composition.domain.repository

import com.firdavs.android.composition.domain.entity.GameSettings
import com.firdavs.android.composition.domain.entity.Level
import com.firdavs.android.composition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ) : Question

    fun getGameSettings(level: Level) : GameSettings
}