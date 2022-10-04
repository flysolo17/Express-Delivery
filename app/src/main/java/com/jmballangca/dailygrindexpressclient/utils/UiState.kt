package com.jmballangca.dailygrindexpressclient.utils

sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<out T>(val data : T) : UiState<T>()
    data class Failure(val message : String) : UiState<Nothing>()
}