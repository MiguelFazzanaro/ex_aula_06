package br.com.digitalhouse.ex2

class SessaoDeTreinamento (){
    fun treinarA(jogador:JogadorDeFutebol){
        println("********************Inicio do Treino******************************")
        println("Estatistica do jogador ${jogador.nome} antes do treino:")
        println("Energia: ${jogador.energia} Alegria: ${jogador.alegria} Gols: ${jogador.gol} ")
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        println("********************Fim do Treino******************************")
        println("Nivel de experiencia inicial: ${jogador.experiencia}")
        jogador.experiencia += 1
        println("Nivel de experiencia final: ${jogador.experiencia} ")
        println("Estatistica do jogador ${jogador.nome} apos o treino:")
        println("Energia: ${jogador.energia} Alegria: ${jogador.alegria} Gols: ${jogador.gol} ")
        println("----------------------------------------------------------------")
    }

}