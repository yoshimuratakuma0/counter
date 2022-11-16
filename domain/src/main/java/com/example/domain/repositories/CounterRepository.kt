package com.example.domain.repositories

interface CounterRepository {
    suspend fun getCount(): Int
    suspend fun saveCount(count: Int)
}