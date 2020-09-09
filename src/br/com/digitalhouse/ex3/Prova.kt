package br.com.digitalhouse.ex3

class Prova (var dificuldade: Int, var energiaNecessaria: Int) {
    fun podeRealizar (atleta: Atleta): Boolean {
        return (energiaNecessaria <= atleta.energia) && (dificuldade <= atleta.nivel)
    }
}