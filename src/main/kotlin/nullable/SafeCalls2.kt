package nullable

fun main(){
    /**
     * Smart cast para tipos que não aceitam null
     */
    val s1: String? = "abcde"
//    val s1: String? = null

    if (s1 != null){
        println(s1)

        val s2 = s1.uppercase()
        println(s2)

        val s3 = s2.reversed()
        println(s3)

        val l = s3.length
        println(l)
    }
}