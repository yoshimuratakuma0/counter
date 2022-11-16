package com.example.domain.usecases

abstract class AbstractUseCase<P, R> {
    abstract fun execute(params: P): R
    operator fun invoke(params: P) = execute(params)
}