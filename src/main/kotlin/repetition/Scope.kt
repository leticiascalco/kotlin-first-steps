package repetition

fun main(){

    /**
     * Entendendo o escopo de variáveis definidas em blocos
     */

    val x = 10

    if(x == 10) {
        val y = 5
        println(y)
    }

    for (i in 0 ..100) {
        println(i)
    }

    while (x == 10){
        val j = x
        println(j)
    }

    do {
        val z = 5
    } while (z == 10)  // penas no do while consigo utilizar a variavel no bloco while que foi criada no escopo Do

    val y: Int

    if(x == 10) {
        y = 10
    } else {
        y = 0
    }
    println(y)
}