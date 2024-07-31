package operators

fun main(){
    /**
     * Conversão de tipos de dados em operações aritiméticas
     *
     */

    //quando operamos numeros do mesmo tipo, o resultado sempre é do mesmo tipo, por isso a operacao abaixo da 3 (inteiro)
    val a = 10
    val b = 3

    val a1 = 10.0
    val b1 = 3.0

    println(a1 / b1)

    //Sempre que vc opera com numeros de tipos diferentes, o resultado vai ser o tipo mais abrangente (com numeros maiores)
    val a2 = 10.0
    val b2 = 3

    println(a2 / b2)

    val c = 30L
    val d = 20
    println(c * d)


    println(10 / (3).toDouble())
}