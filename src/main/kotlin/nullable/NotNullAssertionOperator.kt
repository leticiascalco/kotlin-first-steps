package nullable

fun main(){
    /**
     * 57. Assumindo o controle com o not null assertion operator
     * Usar com cautela, dificilmente utilizado
     */

    val s: String? = "abcde"
    val i = s!!.reversed()  //vc deve garantir que s NUNCA sera nullo, senao tera nullPointerException
    println(i)


    /**
     * Exrecicio
     *
     * Escreva um programa que mascara uma senha, substituindo seus caracteres por '*'. Se a senha for nula, a senha
     * '1234'deve ser usada, a qual deve ser mascarada depois.
     */

    val password :String? =  null
    val defaultPassword = "1234"
    val mask1 = "".padEnd(password?.length ?: defaultPassword.length, '*') //posso fazer assim ou:

    val mask = "".padEnd((password ?: defaultPassword).length, '*')
    println(password)
    println(mask)

    /**
     * Exercício
     *
     *
     * Escreva um programa que solicita um número a um usuário, multiplica ele por 2 duas vezes e subtrai 10. Se o
     * usuário digitar algo que não possa ser convertido em um número, o úmero 2 deve ser assumido como padrão.
     * O programa deve calcular o valor do número e mostrá-lo na tela em uma única expressão.
     */

    println(
        readln()
            .toIntOrNull()
            ?: 2 //se o valor digitado nao for int ele assume o 2
            .times(2)
            .times(2)
            .minus(10)
    )


}