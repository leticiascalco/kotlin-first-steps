package nullable

fun main(){
    /**
     * Usando o elvis operetor
     *
     */

    val value: Int? = 10

//    val value2 = if(value != null) value else 0
//    println(value2)

    //Usando elvis ?:
    val value2 = value ?: 0
    println(value2)
}