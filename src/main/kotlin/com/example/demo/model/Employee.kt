package com.example.demo.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Employee {
    @Id
    @GeneratedValue
    val id: Long? =  null //todo инициализация не нужна
    val salary: Long? = null //todo инициализация не нужна
    val fio: String? = null
    //todo Поля не приватные чтобы не герить геттеры и сеттеры
}