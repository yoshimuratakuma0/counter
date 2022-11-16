package com.example.domain.repositories

import kotlinx.coroutines.flow.StateFlow

interface CounterRepository {
    fun fetchCounter(): StateFlow<Int>
    fun saveCount(count: Int)
}