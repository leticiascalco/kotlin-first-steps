package selection

fun main(){
    /**
     * WHEN
     */

    val x = 0

    when(x){
        10 -> println("é 10")
        20 -> println("é 20")
        30 -> println("é 30")
        else -> println("Desconhecido")
    }

    when(x){
        in 0..10 -> println("0 a 10")
        in 11.. 30 -> println("11 a 30")
        else -> println("Outro intervalo")
    }

    when(x) {
        0, 2, 4, 6 -> println("PAR")
        else -> println("Desconhecido")
    }

    when{
        x > 0 -> println("POSITIVO")
        x < 0 -> println("NEGATIVO")
        else -> println("ZERO")
    }

    /**
     * Usando When como expressão que retorna valores
     *
     * Ele retorna sempre a ultima expressão executada do bloco (sempre ira precisar do else)
     */
    val resposta = when{
        x > 0 -> "POSITIVO"
        x < 0 ->"NEGATIVO"
        else -> "ZERO"
    }
    println(resposta)

    println(
        when{
            x > 0 -> "POSITIVO"
            x < 0 -> "NEGATIVO"
            else -> "ZERO"
        }
    )

    val s= 'A'

    val v = when(s) {
            'A', 'a' -> 1
            'B', 'b' -> 2
            else -> 3
    }
    println(v)

    /**
     * Exercicio
     *
     * Implemente uma calculadora capaz de executar as 4 operações básicas e que recebe os dados via teclado.
     * Três informações deevem ser passadas: prieiro operando, a operação mateática e o segundo opeando.
     *
     * Por exemplo:
     * > 20
     * > +
     * > 4
     * Resultado: 24
     */
    print("> ")
    val v1 = readln().toDouble()

    print("> ")
    val op = readln()[0]

    print("> ")
    val v2 = readln().toDouble()

    val r = when (op){
        '+' -> v1 + v2
        '-' -> v1 - v2
        '*' -> v1 * v2
        '/' -> v1 / v2
        else -> 0
    }
    println("Resultado: $r")

}