package com.firdavs.android.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GameResult(
    var winner: Boolean,
    var countOfRightAnswers: Int, // количество правильных ответов
    var countOfQuestions: Int,    // общее количество вопросов
    var gameSettings: GameSettings,
) : Parcelable