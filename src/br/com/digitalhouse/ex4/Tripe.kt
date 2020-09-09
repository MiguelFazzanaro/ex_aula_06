package br.com.digitalhouse.ex4

class Tripe (val alturaMinima: Float,val alturaMaxima: Float,var alturaAtual: Float, var dobrado: Boolean) {

    fun definirAltura (novaAltura: Float){
        if (novaAltura < alturaMinima || novaAltura > alturaMaxima){
            println("Não foi possivel ajustar a altura do tripé. Inserir um valor entre $alturaMinima e $alturaMaxima")
        }
        else {
            alturaAtual = novaAltura
            println("Nova altura definida. O tripé está agora com $alturaAtual")
        }
    }

    fun dobrar (){
        if (dobrado) {
            println("tripé ja esta dobrado")
        }
        else{
            println("o tripé foi dobrado")
            dobrado = true
        }
    }

    fun desdobrar (){
        if (!dobrado) {
            println("tripé ja esta desdobrado")
        }
        else {
            println("o tripé foi desdobrado")
            dobrado = false
        }
    }

    fun prontoParaGuardar (): Boolean {
        if (dobrado && alturaAtual == alturaMinima){
            println("tripé esta pronto para guardar")
            return true
        }
        else {
            println("tripé nao esta pronto para guardar")
            return false
        }
    }

    fun guardar (){
        if (prontoParaGuardar()) {
            println("tripé guardado")
        }
        else {
            println("não é possivel guardar o tripé, dobre-o e mantenha na altura minima")
        }
    }

    fun prontoParaUsar(): Boolean {
        if (!dobrado && alturaAtual >= (alturaMaxima/2)){
            println("tripé esta pronto para usar")
            return true
        }
        else {
            println("tripé nao esta pronto para usar")
            return false
        }
    }

    fun usar (){
        if (prontoParaUsar()) {
            println("tripé sendo utilizado")
        }
        else {
            println("não é possivel usar o tripé, desdobre-o e coloque na altura ideal")
        }
    }

}


