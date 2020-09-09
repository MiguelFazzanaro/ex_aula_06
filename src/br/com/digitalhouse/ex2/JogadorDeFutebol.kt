package br.com.digitalhouse.ex2

class JogadorDeFutebol (val nome: String, var energia: Int, var alegria: Int, var gol: Int, var experiencia: Int) {

    fun fazerGol (){
        energia -= 5
        alegria += 10
        gol += 1
        println ("GOOOOOL o/")
    }

    fun correr(){
        energia -= 10
        println ("Cansei :(")
    }
}