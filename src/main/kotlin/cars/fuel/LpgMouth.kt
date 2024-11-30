package ru.otus.cars.cars.fuel

class LpgMouth(private val tank: Tank) : TankMouth() {
    override fun open() {
        println("Газовая горловина открыта")
    }

    override fun close() {
        println("Газовая горловина закрыта")
    }

    fun fuelLpg(liters: Int) {
        tank.receiveFuel(liters)
    }
}