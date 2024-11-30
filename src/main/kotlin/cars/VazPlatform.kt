package ru.otus.homework.cars

import ru.otus.cars.cars.fuel.Tank

abstract class VazPlatform(override val color: String) : Car {
    // Положение руля. Доступно только внутри класса и наследникам
    protected var wheelAngle: Int = 0 // Положение руля

    // Реализация интерфейса CarInput
    override fun wheelToRight(degrees: Int) { wheelAngle += degrees }
    // Реализация интерфейса CarInput
    override fun wheelToLeft(degrees: Int) { wheelAngle -= degrees }

    // Получить оборудование
    override fun getEquipment(): String = "Кузов, колеса, движок"

    // Абстрактное свойство двигателя
    abstract val engine: VazEngine

    abstract val tank: Tank
}