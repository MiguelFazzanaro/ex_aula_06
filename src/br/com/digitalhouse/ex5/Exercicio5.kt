package br.com.digitalhouse.ex5

fun main() {
    var veiculo1 = Veiculo("Uno", 2000, "Branco" ,50000)
    var cliente1 = Cliente ("José", "Silva", "555-1234")
    var venda1 = Venda(10000F, veiculo1,cliente1)
    var vendaConcessionaria = Concessionaria()

    vendaConcessionaria.registrarVenda(veiculo1.modelo,cliente1.nome,venda1.valorDaVenda)
}