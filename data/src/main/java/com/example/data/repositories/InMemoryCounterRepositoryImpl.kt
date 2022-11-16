package com.example.data.repositories

import com.example.domain.repositories.CounterRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class InMemoryCounterRepositoryImpl : CounterRepository {
    private val _counter = MutableStateFlow(0)

    override fun fetchCounter(): StateFlow<Int> {
        return _counter.asStateFlow()
    }

    override fun saveCount(count: Int) {
        _counter.update {
            _counter.value + 1
        }
    }
}