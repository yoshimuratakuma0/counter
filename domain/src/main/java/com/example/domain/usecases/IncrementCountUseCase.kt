package com.example.domain.usecases

import com.example.domain.repositories.CounterRepository

class IncrementCountUseCase(
    private val repository: CounterRepository,
) : AbstractUseCase<Int, Unit>() {
    override fun execute(params: Int) {
        repository.saveCount(params + 1)
    }
}