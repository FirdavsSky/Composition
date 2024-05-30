package com.firdavs.android.composition.domain.entity

data class GameResult(
    val winner: Boolean,
    val countOfRightAnswers: Int, // количество правильных ответов
    val countOfQuestions: Int,    // общее количество вопросов
    val gameSettings: GameSettings
)