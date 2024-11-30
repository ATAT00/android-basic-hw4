package ru.otus.cars.cars.fuel

class PetrolMouth(private val tank: Tank) : TankMouth() {
    override fun open() {
        println("Бензиновая горловина открыта")
    }

    override fun close() {
        println("Бензиновая горловина закрыта")
    }

    fun fuelPetrol(liters: Int) {
        tank.receiveFuel(liters)
    }
}

