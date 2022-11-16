package com.example.countup.di

import com.example.data.repositories.InMemoryCounterRepositoryImpl
import com.example.domain.repositories.CounterRepository
import com.example.domain.usecases.FetchCounterUseCase
import com.example.domain.usecases.IncrementCountUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    @Singleton
    fun provideCounterRepository(): CounterRepository {
        return InMemoryCounterRepositoryImpl()
    }

    @Provides
    fun provideIncrementCountUseCase(
        repository: CounterRepository,
    ): IncrementCountUseCase {
        return IncrementCountUseCase(
            repository = repository,
        )
    }

    @Provides
    fun provideFetchCounterUseCase(
        repository: CounterRepository,
    ): FetchCounterUseCase {
        return FetchCounterUseCase(
            repository = repository,
        )
    }
}