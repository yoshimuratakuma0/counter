package com.example.presentation.viewmodels

import androidx.lifecycle.ViewModel
import com.example.domain.usecases.FetchCounterUseCase
import com.example.domain.usecases.IncrementCountUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    fetchCounterUseCase: FetchCounterUseCase,
    private val incrementCountUseCase: IncrementCountUseCase,
) : ViewModel() {
    val counter = fetchCounterUseCase(Unit)

    fun onClickIncrementer() {
        val currentCount = counter.value
        incrementCountUseCase.execute(currentCount)
    }
}