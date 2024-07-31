package repetition

import kotlin.random.Random

fun main(){

    /**
     * Estrutura de repetição For
     */

    for (i in 0 .. 10){
        print("$i ")
    }
    println()
    for ( i in 10 downTo 0 step 2) {
        print("$i ")
    }
    println()
    for (i in 10 until 100 step 3){
        print("$i")
    }


    /**
     * Exercicio
     * Imprima a tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
     * Usando for
     */

    print("> ")
    val n = readln().toInt()

    var m = 10

    for(x in 1..m){
        println("$n x $x = ${n * x}")
    }

    /**
     * Pulando para o teste loop
     */

    for (i in 0..50){
        if(i % 10 == 0) {
            continue  //usar apenas em estruturas de repetição
        }
        print("$i ")
    }

    /**
     * Pulando para fora do Loop
     */
    for(i in 0..50){
        if(i == 20) {
            break
        }
        print("$i ")
    }
    println("FIM")

    /**
     *
     * 50. Usando labels para controlar a execução de loops
     */

    loop@ for(i in 'A'.. 'E'){
        for(j in 1..5){
            print("$i$j ")

            if (j == 3){
                //break@loop
                continue@loop
            }
        }
        println()
    }
    println("\nFIM")

    /**
     * Exercicio
     *
     * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório deontro de um intervalo e você
     * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor do que o número tentado.
     * O joogo acaba quando o número tentado for o número correto.
     */

    val secret = Random.nextInt(0,101)

    while(true) {
        print("> ")
         val n = readln().toInt()

        when {
            n > secret -> println(" O número sorteado é menor ")
            n < secret -> println(" O número sorteado é maior ")
            else -> {
                println("PARABÉNS? Você acertou o número, que era $n")
               break
            }
        }
    }
}