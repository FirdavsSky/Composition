package com.firdavs.android.composition.domain.entity

data class GameSettings(
    val maxSumValue: Int,
    val minCountIfRightAnswer: Int,
    val minPercentOfRightAnswer: Int,
    val gameTimeInSeconds: Int
)