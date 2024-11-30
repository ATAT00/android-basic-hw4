package ru.otus.homework.cars

/**
 * Сборщик машины
 */
sealed interface CarBuilder {
    /**
     * Собери машину
     */
    fun build(plates: Car.Plates): Car
}


