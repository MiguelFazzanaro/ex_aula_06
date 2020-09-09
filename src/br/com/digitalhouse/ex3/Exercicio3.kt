package br.com.digitalhouse.ex3

fun main(){
    val atleta1 = Atleta("João", 50, 80)
    val atleta2 = Atleta("José", 20, 40)

    val prova1 = Prova(20, 20)
    val prova2 = Prova(100, 100)
    val prova3 = Prova(50,50)

    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1) )
    println(prova3.podeRealizar(atleta1))
    println(prova1.podeRealizar(atleta2))
    println(prova2.podeRealizar(atleta2))
    println(prova3.podeRealizar(atleta2))


}