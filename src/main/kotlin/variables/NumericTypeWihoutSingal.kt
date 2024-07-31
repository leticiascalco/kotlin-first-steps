package variables

fun main(){
    /**
     * Tipos de dados numéricos sem sinal: significa numeros que apenas podem ser POSITIVOS
     *
     * Byte -> UByte
     * Short -> UShort
     * Int ->  UInt
     * Long -> ULong
     */
     val x = 100U
      val y = 100UL

    val x2 = x.toInt()
    val y2 = y.toDouble()

    val x3 = -20
//    val x4 = x3.toUInt()
    val x4 = x3.toUInt()
    println(x4)
}