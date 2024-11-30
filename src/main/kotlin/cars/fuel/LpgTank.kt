package ru.otus.cars.cars.fuel

class LpgTank: Tank {
    private var fuelAmount: Int = 0
    override val mouth: TankMouth = LpgMouth(this)

    override fun getContents(): Int = fuelAmount

    override fun receiveFuel(liters: Int) {
        fuelAmount += liters
    }
}