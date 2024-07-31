package repetition

fun main(){
    /**
     * Estruturas de repetição do while
     */

    var x = 0

    while(x <= 10) {
        print("$x, ")
        x++
    }

    print("$x, ")
    x = 0
    do {  //executa pelo menos 1 vez
        print("$x ")
        x++
    } while (x<=10)


    var x1 = 10
    while (x1 < 5) {
        print("$x1")
    }

    do {
        print("$x1")
    } while (x < 5)


    /**
     * Exercicio
     * Imprima a tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
     */


    print("> ")
    val n= readln().toInt()

    var i =1
    val m = 15
    while(i <=m)
        println("$n x $i = ${ n * i++ }")

}