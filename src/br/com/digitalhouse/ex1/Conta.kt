package br.com.digitalhouse.ex1

class Conta(val nroconta: Int, var saldo: Float, val titular: Cliente) {
    init{
        println("***Novo cliente cadastrado: Cliente $nroconta - ${titular.nome} ${titular.sobrenome}. Seu saldo atual é R$$saldo***")
        println("")
    }

    fun depositar (valorDepositado: Float) {
        saldo += valorDepositado
        println("----------------------------------------------------------------------------------------")
        println("------------------------------Banco Digital House---------------------------------------")
        println("----------------------------------------------------------------------------------------")
        println("                             Comprovante de Depósito")
        println("Depósito efetuado na conta: $nroconta ")
        println("Titular da Conta: ${titular.nome} ${titular.sobrenome} ")
        println("Valor depositado: R$$valorDepositado")
        println("Saldo Atual R$$saldo")
        println("----------------------------------------------------------------------------------------")
        println("")
    }

    fun sacar (valorSacado: Float) {
        saldo -= valorSacado
        println("----------------------------------------------------------------------------------------")
        println("------------------------------Banco Digital House---------------------------------------")
        println("----------------------------------------------------------------------------------------")
        println("                              Comprovante de Saque")
        println("Saque efetuado na conta: $nroconta ")
        println("Titular da Conta: ${titular.nome} ${titular.sobrenome} ")
        println("Valor Sacado: R$$valorSacado")
        println("Saldo Atual R$$saldo")
        println("----------------------------------------------------------------------------------------")
        println("")
    }
}