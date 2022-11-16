package com.example.data.repositories

import com.example.domain.repositories.CounterRepository

class InMemoryCounterRepositoryImpl : CounterRepository {
    private var count = 0
    override suspend fun getCount(): Int {
        return count
    }

    override suspend fun saveCount(count: Int) {
        this.count = count
    }
}