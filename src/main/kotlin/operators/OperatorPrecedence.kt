package operators

fun main(){
    //Precedencia de operadores

    val exp = 5 + 4 - 3 * 2 * ( 1 + 1 ) / 3

    //Primeiro os parenteses, multiplicaçâo e divisão. Soma e substracao em qualquer ordem
    // Primeiro o que estiver mais a esquerda

    // 5  + 4 - 3 * 2 * 2 /3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    //  5 + 4 - 4
    // 9 - 4
    // 5
    println(exp)
//----------------------
//Primeiro o NOT, depois o AND e por ultimo o OR

    val exp2 = true && false || true && !false
    // T && F || T && T
    // F || T
    // T
    println(exp2)

    /**
     * EXERCICIO
     *
     * Encontre o resultado da seguinte expressão:
     *
     * (5 * 3) * 2 < 30 / 2 || !(5 - 1 <= 8 %3)
     */
val exp3 = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 %3)

    //Primeiro a expressao aritmetica?

    // 8 * 2 < 30 / 2 || !(5-1 <= 8 %3)
    // 16 < 30 / 2 ||  !(5-1 <= 8 %3)
    // 16 < 15 || !(5-1 <= 8 %3)
    // 16 < 15 || !(5-1 <= 2)
    // 16 < 15 || !(4 <= 2)
    //16 < 15 || !(f)
    // falso || true
    // true

    println(exp3)

//Primeiro os calculos, depois relacional depois logico
    val exp4 = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(8 >= 8 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(true && true)
    // !(true)
    // false
    println(exp4)
}