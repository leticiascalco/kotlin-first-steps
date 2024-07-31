package operators

fun main(){
    /**
     * Pré incremento e pós incremento
     */

    var x = 8

    println(x++) //primeiro le, depois incrementa
    println(x)

    var y = 8
    println(++y) //primeiro incrementa, depois le
    println(y)

    var z = 5

    println(z--)
    println(z)

    var w = 5
    println(--w)
    println(w)

}