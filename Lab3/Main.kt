package com.example.myapplication.Lab3

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
        val shark = Shark()
        val pleco = Plecostomus()
        println("Shark: ${shark.color}")
        shark.eat()
        println("Plecostomus: ${pleco.color}")
        pleco.eat()
}

fun main() {
    buildAquarium()
    makeFish()
}