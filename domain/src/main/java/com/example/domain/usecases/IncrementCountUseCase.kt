package com.example.domain.usecases

import com.example.domain.repositories.CounterRepository
import kotlinx.coroutines.CoroutineDispatcher

class IncrementCountUseCase(
    dispatcher: CoroutineDispatcher,
    private val repository: CounterRepository,
) : CoroutineUseCase<Unit, Int>(dispatcher) {
    override suspend fun execute(params: Unit): Int {
        val currentCount = repository.getCount()
        repository.saveCount(currentCount + 1)
        return repository.getCount()
    }
}