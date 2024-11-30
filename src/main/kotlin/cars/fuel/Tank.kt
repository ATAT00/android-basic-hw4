package ru.otus.cars.cars.fuel

interface Tank {
    val mouth: TankMouth
    fun getContents(): Int
    fun receiveFuel(liters: Int)
}