package com.example.myapplication

//EJERCICIO 2
fun filtraJuegos(list: List<Videojuego>, ano: String) : MutableList<Videojuego>
{
    return list.filter { it.ano.equals(ano)}.toMutableList()
}


//EJERCICIO 3
fun mapaJuegos(list : List<Videojuego>) : HashMap<String,MutableList<Videojuego>>
{
    var map = HashMap<String,MutableList<Videojuego>>()
    for (i in list)
    {
        if(i.plataforma in map.keys)
        {
            map[i.plataforma]?.add(i)
        }else{
            map.put(i.plataforma, mutableListOf(i))
        }
    }
    return map
}

fun plataformas(list: List<Videojuego>) : MutableList<String>
{
    var ret = mutableListOf<String>(list[0].plataforma)

    list.map{
        if(it.plataforma  !in ret)
        {
            ret.add(it.plataforma)
        }
    }

    return ret
}

fun championsLeague(list: MutableList<EquipoFutbol>)
{
    list.shuffle()

    var sides = list.chunked(list.size/2)

    println("SORTEO DE OCTAVOS: \n")

    var i = 0

    while(i<sides[0].size)
    {
        println("${sides[0][i]} VS ${sides[1][i]}")
        i++
    }


}


fun main()
{

//    EJERCICIO 1
    var juego1 = Videojuego("Manue1", "play teichon", "2003")
    var juego2 = Videojuego("Manue2", "pc", "2003")
    var juego3 = Videojuego("Manue3", "pc", "2004")
    var juego4 = Videojuego("Manue4", "pc", "2004")
    var juego5 = Videojuego("Manue5", "xcaja", "2004")
    var juego6 = Videojuego("Manue6", "xcaja", "2005")
    var juego7 = Videojuego("Manue7", "cortacesped", "2005")
    var juego8 = Videojuego("Manue8", "cortacesped", "2003")

    println("EJERCICIO 1")
    println(juego1)

//    EJERCICIO 2
    var list = mutableListOf<Videojuego>(juego1,juego2,juego3,juego4,juego5,juego6,juego7,juego8)

    var filteredList = filtraJuegos(list, "2003")
    println("EJERCICIO 2")
    println(filteredList)


//    EJERCICIO 3

    var mapppedList = mapaJuegos(filteredList)
    println("EJERCICIO 3")
    println(mapppedList)

//    EJERCICIO 4

    var plats = plataformas(list)
    println("EJERCICIO 4")
    println(plats)

//    EJERCICIO 5

    var circunferencia = Circunferencia(23.0)
    var circunferencia2 = Circunferencia(listOf(0,0), listOf(4,6))

    println("EJERCICIO 5")
    println(circunferencia)
    println(circunferencia.longitud())
    println(circunferencia2)

//    EJERCICIO 8

    var circulo1 = Circulo(34.0, "amarillo")
    var circulo2 = Circulo(mutableListOf<Int>(0,0), mutableListOf<Int>(4,6),"rojo")
    println("EJERCICIO 8")
    println(circulo1)
    println(circulo2)

    println(circulo1.area())

//    EJERCICIO 9

    var equipo1 = EquipoFutbol("aguacateros1", "Colombia")
    var equipo2 = EquipoFutbol("aguacateros2", "Colombia")
    var equipo3 = EquipoFutbol("aguacateros3", "Colombia")
    var equipo4 = EquipoFutbol("aguacateros4", "Colombia")
    var equipo5 = EquipoFutbol("aguacateros5", "Peru")
    var equipo6 = EquipoFutbol("aguacateros6", "Peru")
    var equipo7 = EquipoFutbol("aguacateros7", "Peru")
    var equipo8 = EquipoFutbol("aguacateros8", "Peru")
    var equipo9 = EquipoFutbol("aguacateros9", "China")
    var equipo10 = EquipoFutbol("aguacateros10", "China")
    var equipo11 = EquipoFutbol("aguacateros11", "China")
    var equipo12 = EquipoFutbol("aguacateros12", "China")
    var equipo13 = EquipoFutbol("aguacateros13", "Sobrasada")
    var equipo14 = EquipoFutbol("aguacateros14", "Sobrasada")
    var equipo15 = EquipoFutbol("aguacateros15", "Sobrasada")
    var equipo16 = EquipoFutbol("aguacateros16", "Sobrasada")

    println("EJERCICIO 9")
    println(equipo1)

//    EJERCICIO 10

    var team_list = mutableListOf(equipo1,equipo2,equipo3,equipo4,equipo5,equipo6,equipo7,equipo8,equipo9,equipo10,equipo11,equipo12,equipo13,equipo14,equipo15,equipo16)
    println("EJERCICIO 10")
    println(team_list)


//    EJERCICIO 11
    println("EJERCICIO 11")
    championsLeague(team_list)






}