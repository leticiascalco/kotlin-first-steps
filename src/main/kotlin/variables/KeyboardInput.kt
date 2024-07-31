package variables

import java.util.*

fun main(){

    /**
     * Lendo dados via teclado: readIn
     */

    print("Digite o seu nome: ")
    val name = readln()

    println("Seu nome invertido é:  ${name.reversed().lowercase()}")

    print("> ")
    val n1 = readln().toInt()

    print("> ")
    val n2 = readln().toInt()

    println("Result:  ${(n1 + n2)}")



}