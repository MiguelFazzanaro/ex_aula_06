package br.com.digitalhouse.ex1


fun main(){
    val cliente1 = Cliente("José", "Santos")
    val contaCl1 = Conta(1,0F, cliente1)


    contaCl1.depositar(10000F)
    contaCl1.sacar(150F)

    val cliente2 = Cliente("João", "Silva")
    val contaCl2 = Conta(2,2000F, cliente2)

    contaCl2.depositar(100F)
    contaCl2.sacar(1500F)

}