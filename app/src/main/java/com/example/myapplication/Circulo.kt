package com.example.myapplication

class Circulo : Circunferencia {
    var color : String

    constructor(r: Double, color: String) : super(r) {
        this.color = color
    }

    constructor(c: MutableList<Int>, p: MutableList<Int> , color: String) : super(c, p) {
        this.color = color
    }

    override fun toString(): String {
        var ret = super.toString()
        ret += " color: ${this.color}"
        return ret
    }

    fun area() : Double
    {
        return Math.PI*super.r*super.r
    }
}