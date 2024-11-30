package ru.otus.cars.cars.fuel

class PetrolTank: Tank {
    private var fuelAmount: Int = 0
    override val mouth: TankMouth = PetrolMouth(this)

    override fun getContents(): Int = fuelAmount

    override fun receiveFuel(liters: Int) {
        fuelAmount += liters
    }
}