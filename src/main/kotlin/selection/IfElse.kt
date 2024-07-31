package selection

import java.util.*

fun main(){

    //ELSE
    val temp = 25
    if (temp > 22){
        println("Está calor")
    } else {
      println("Está frio")
    }

    /**
     * Exercício
     *
     * Escreva um programa que recebe um valor numérico pelo teclado, multiplica por ele mesmo e imprime o resultado.
     * Entretanto, se o valor fornecido for maior que 10, deve ser ajustado para 10 antes de ser multiplicado
     */


    println("Digite um valor: ")
    var valor = Scanner(System.`in`).nextInt() // ou readIn().toInt()
    if ( valor > 10) {
        valor = 10
    }
    valor*=valor
    println(valor)


    /**
     * Exercicio
     *
     * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
     */

    print(">")
    val x = readln().toInt()

    if(x%2==0){
        println("PAR")
    } else {
        println("ÍMPAR")
    }

    /**
     * ELSE IF
     */
    val v = 10

    if(v > 0) {
        println("POSITIVO")
     } else if (v < 0) {
         println("NEGATIVO")
     } else {
         println("ZERO")
     }


    /**
     * Exercício
     *
     * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
     *
     */

    println("> ")
    val age = readln().toInt()

    if (age >= 0 && age <= 12) {
        println("CRIANÇA")
    } else if (age >=13 && age <= 17) {
        println("ADOLESCENTE")
    } else if (age > 18 && age <=65) {
        println("ADULTO")
    } else if (age >= 66 && age <= 120){
        println("SENIOR")
    } else {
        println("Idade inválida")
    }

    /**
     * IF como uma expressão que retorna valores
     *
     */

   val n = 10

   val r =  if (n%2 ==0) {
        "PAR"  //esta expressao sera retornada caso entre no bloco
    } else {
       "IMPA"  //esta expressao sera retornada caso entre no bloco, precisa ter ELSE e precisa ser do mesmo tipo de retorno, no caso 2 strings
    }

    println(r)
}