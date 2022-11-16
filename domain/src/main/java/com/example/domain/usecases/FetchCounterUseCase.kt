package com.example.domain.usecases

import com.example.domain.repositories.CounterRepository
import kotlinx.coroutines.flow.StateFlow

class FetchCounterUseCase(
    private val repository: CounterRepository,
) : AbstractUseCase<Unit, StateFlow<Int>>() {
    override fun execute(params: Unit): StateFlow<Int> {
        return repository.fetchCounter()
    }
}