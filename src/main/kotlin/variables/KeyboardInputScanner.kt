package variables

import java.util.*

fun main(){
    val scanner = Scanner(System.`in`)
    print("> ")
    val n1 = scanner.nextInt()

    print("> ")
    val n2 = scanner.nextInt()

    println("Result: ${n1 + n2}")


    /**
     * Exercicio
     * ---------
     *
     * Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas informações (use string templates para
     * montar a frase)
     */

    val scanner2 = Scanner(System.`in`)
    print("Olá, por favor digite seu nome >> ")
    val nome = scanner2.nextLine()
    print("Agora digite a sua idade >> ")
    val idade = scanner2.nextInt()
    print("Agora digite o seu peso atual ")
    val peso = scanner2.nextDouble()
    print("Olá  ${nome}, sua idade informada é ${idade} anos e seu peso atual é ${peso}KG")


    /**
     * Exercicio
     * --------
     *
     * Crie um programa que arredonda um valor decimal informado pelo usuário e mostra a resposta na tela.
     * O arredondamento pode ser feito truncando as casas decimais.
     */

    print("Infrome um valor decimal para arredondar >> ")
    print("O resultado arredondado é: >> ${readln().toDouble().toInt()}")

}