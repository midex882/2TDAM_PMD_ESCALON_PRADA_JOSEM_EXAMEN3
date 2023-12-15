package com.example.myapplication

open class Circunferencia(var r: Double) {
    var c : List<Int> = listOf(0,0)
    var p : List<Int> = listOf(3,3)

    constructor(ce : List<Int>, pe: List<Int>) : this(10.0) {
        this.c = ce
        this.p = pe
    }

    fun longitud() : Double
    {
        return 2*Math.PI*this.r
    }

    override fun toString() : String
    {
            return "CIRCUNFERENCIA:  radio: ${this.r}   centro: ${this.c[0]},${this.c[1]} punto: ${this.p[0]},${this.p[1]}"
    }

}