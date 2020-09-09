package br.com.digitalhouse.ex2

fun main (){
    val jogador1 = JogadorDeFutebol("José", 100, 80, 10, 100)
    val treinoJogador1 = SessaoDeTreinamento()
    val jogador2 = JogadorDeFutebol ("João", 50, 10, 0, 50)
    val treinoJogador2 = SessaoDeTreinamento()

    treinoJogador1.treinarA(jogador1)
    treinoJogador2.treinarA(jogador2)

}