package com.example.demo

import java.lang.IllegalArgumentException

class Car {
    private lateinit var direction:Direction

    fun drive(direction: Direction): String {
        when (direction) {
            Direction.NORTH -> return "поехали на север"
            Direction.SOUTH -> return "поехали на юг"
            Direction.EAST -> return "поехали на восток"
            Direction.WEST -> return "поехали на запад"
            else -> throw IllegalArgumentException()
        }
    }
}