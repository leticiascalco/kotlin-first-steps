import java.util.Scanner
import kotlin.random.Random

fun main() {

    /**
     * Print no console:
     */
//    println("Hello")
//    println("Kotlin!")


    /**
     * Variáveis:
     */
//    var counter: Int
//    counter = 10
//    var counter: Int = 10

    var counter = 10  //type inference, assume o tipo atraves do valor atribuido

    val counter2 = 10  //variavel imutável (canot be reassigned), prefira usar val para garantir a integridade da variavel

    /**
     * Tipos de dados Numéricos:
     *
     * Byte: 1 byte - 8 bits
     * Short: 2 bytes - 16 bits
     * Int: 4 bytes - 32 bits
     * Long: 8 bytes - 64 bits
     */

//    val i1 = 10
//    val i2: Int = 10
//    val i3: Int

//    val l1 = 10L

    /**
     * Tipos de dados numéricos com decimal:
     *
     */

//    val d1 = 14.5
//    val d2: Double = 5.8
    val f1 = 14.5F
    val f2: Float = 32.5f // precisa ser explicito senao ele assume que é Double

    /**
     * Conversão entre tipos de dados numéricos diferentes
     */
    val i1 = 10
    val d1 = i1.toDouble()
//    println(d1)

    val l1 = i1.toLong()
//    println(l1)

    val d2 = 10.34
    val i2 = d2.toInt() // trunca o valor
//    println(i2)

    val i3 = 2000
//    val b1 = i3.toByte()
//    println(b1)

    /**
     * Tipos de dados numéricos sem sinal:
     *
     * Byte -> UByte
     * Short -> UShort
     * Int ->  UInt
     * Long -> ULong
     */
   // val x = 100U
  //  val y = 100UL

//    val x2 = x.toInt()
//    val y2 = y.toDouble()

//    val x3 = -20
//    val x4 = x3.toUInt()
//    val x4 = x3.toUInt()
//    println(x4)

    /**
     * Tipo Boolean:
     */
//
//    val b1: Boolean = true
//    val b2 = false

    /**
     * Tipo Char
     *
     */
//    val c: Char = 'A'
//    println(c)
//    println(c.code)
//    val i = 65
//    println(i.toChar())
//
//    val c2 = '1'
//    val c3 = 'a'
//
//    println(c2.isDigit())
//    println(c2.isLetter())
//    println(c3.isUpperCase())
//    println(c2.digitToInt())
//
//    println(c2.inc().inc())  //incrementa os numeros
//    println(c.inc().inc()) //incrementa o char na sequencia do alfabeto

    /**
     * Tipo tring:
     */

//    val s1 = "abc"
//    val s2 = "def"

//    val s1s2 = "Soma: " + s1 + s2
//    val s1s2 = "Soma: $s1$s2 . O tamanho é: ${(s1+s2).length}"  //String template

//    println(s1s2)

    /**
     * Strings literais
     */

    /**
     * O rato roeu
     * a roupa do
     * rei de "Roma".
     */

//    val s1 = "O rato roeu\na \$roupa do\nrei de \"Roma\"."
//    println(s1)

//    val s2 = """
//       |O rato roeu
//       | a roupa do
//       |rei de "Roma".
//    """.trimMargin() //quebra as linhas a partir das pipes
//        .trimIndent()  //quebra todos os caracteres vazios da primeira linha, e quebra a mesma quantidade para as demais linhas
//    println(s2)

    /**
     * Usando o Modificador const:
     */
//    println(msg)
//    println(x)

    /**
     * Lendo dados via teclado: readIn
     */

//    print("Digite o seu nome: ")
//    val name = readln()
//
//    println("Seu nome invertido é:  ${name.reversed().lowercase()}")

//    print("> ")
//    val n1 = readln().toInt()
//
//    print("> ")
//    val n2 = readln().toInt()
//
//    println("Result:  ${(n1 + n2)}")


//    val scanner = Scanner(System.`in`)
//    print("> ")
//    val n1 = scanner.nextInt()
//
//    print("> ")
//    val n2 = scanner.nextInt()
//
//    println("Result: ${n1 + n2}")



    /**
     * Exercicio
     * ---------
     *
     * Solicite 3 informações ao usuário: nome, idade e peso. Depois imprima uma frase que contenha essas informações (use string templates para
     * montar a frase)
     */

//    val scanner2 = Scanner(System.`in`)
//    print("Olá, por favor digite seu nome >> ")
//    val nome = scanner2.nextLine()
//    print("Agora digite a sua idade >> ")
//    val idade = scanner2.nextInt()
//    print("Agora digite o seu peso atual ")
//    val peso = scanner2.nextDouble()
//    print("Olá  ${nome}, sua idade informada é ${idade} anos e seu peso atual é ${peso}KG")


    /**
     * Exercicio
     * --------
     *
     * Crie um programa que arredonda um valor decimal informado pelo usuário e mostra a resposta na tela.
     * O arredondamento pode ser feito truncando as casas decimais.
     */

//    print("Infrome um valor decimal para arredondar >> ")
//    print("O resultado arredondado é: >> ${readln().toDouble().toInt()}")

    /**
     * Operadores
     *
     */

//    println(10 + 5)
//    println (12 - 7)
//    println(3 * 2)
//    println(15 / 3)
//    println(14 % 3)
//    println(15 % 3)

    /**
     * Conversão de tipos de dados em operações aritiméticas
     *
     */

    //quando operamos numeros do mesmo tipo, o resultado sempre é do mesmo tipo, por isso a operacao abaixo da 3 (inteiro)
    val a = 10
    val b = 3

    val a1 = 10.0
    val b1 = 3.0

//    println(a1 / b1)

    //Sempre que vc opera com numeros de tipos diferentes, o resultado vai ser o tipo mais abrangente (com numeros maiores)
    val a2 = 10.0
    val b2 = 3

//    println(a2 / b2)

    val c = 30L
    val d = 20
//    println(c * d)


//    println(10 / (3).toDouble())

    /**
     * Operadores relacionais: sempre tras um resultado booleano (Verdadeiro ou Falso)
     *
     */

//    println(10 == 10)
//    println(10 != 7)
//    println(5 > 2)
//    println(5 < 2)
//    println(5 >= 5)
//    println(5 <= 5)

    /**
     * Operadores lógicos: Tabela verdade
     *
     */

    //AND
//    println( "T AND T ${true && true}")
//    println( "T AND F ${true && false}")
//    println( "F AND T ${false && true}")
//    println( "F AND F ${false && false}")
//
//    println()

    //OR
//    println( "T OR T ${true || true}")
//    println( "T OR F ${true || false}")
//    println( "F OR T ${false || true}")
//    println( "F OR F ${false || false}")
//
//    println()

    //NOT

//    println("NOT F ${!false}")
//    println("NOT T ${!true}")


    /**
     * Operadores de atribuição
     *
     */
//
//    var x = 5
//
//    x += 2 // x = x + 2
//    println(x)
//
//    x *= 2  // x + x * 2
//
//    println(x)
//
//    x -= 2 // x = x - 2
//
//    println(x)
//
//    x /= 3 // x = x / 3
//
//    println(x)
//
//    x++
//    println(x)
//
//    x--
//    println(x)

    /**
     * Pré incremento e pós incremento
     */

//    var x = 8
//
//    println(x++) //primeiro le, depois incrementa
//    println(x)
//
//    var y = 8
//    println(++y) //primeiro incrementa, depois le
//    println(y)
//
//    var z = 5
//
//    println(z--)
//    println(z)
//
//    var w = 5
//    println(--w)
//    println(w)

    //Precedencia de operadores

//    val exp = 5 + 4 - 3 * 2 * ( 1 + 1 ) / 3

    //Primeiro os parenteses, multiplicaçâo e divisão. Soma e substracao em qualquer ordem
    // Primeiro o que estiver mais a esquerda

    // 5  + 4 - 3 * 2 * 2 /3
    // 5 + 4 - 6 * 2 / 3
    // 5 + 4 - 12 / 3
    //  5 + 4 - 4
    // 9 - 4
    // 5
//    println(exp)
//----------------------
//Primeiro o NOT, depois o AND e por ultimo o OR

//    val exp2 = true && false || true && !false
    // T && F || T && T
    // F || T
    // T
//    println(exp2)

    /**
     * EXERCICIO
     *
     * Encontre o resultado da seguinte expressão:
     *
     * (5 * 3) * 2 < 30 / 2 || !(5 - 1 <= 8 %3)
     */
//val exp3 = (5 + 3) * 2 < 30 / 2 || !(5 - 1 <= 8 %3)

    //Primeiro a expressao aritmetica?

    // 8 * 2 < 30 / 2 || !(5-1 <= 8 %3)
    // 16 < 30 / 2 ||  !(5-1 <= 8 %3)
    // 16 < 15 || !(5-1 <= 8 %3)
    // 16 < 15 || !(5-1 <= 2)
    // 16 < 15 || !(4 <= 2)
    //16 < 15 || !(f)
    // falso || true
    // true

//    println(exp3)

//Primeiro os calculos, depois relacional depois logico
//    val exp4 = !(2 * 4 >= 16 / 2 && 5 == 4 + 1)

    // !(8 >= 8 && 5 == 4 + 1)
    // !(8 >= 8 && 5 == 5)
    // !(true && true)
    // !(true)
    // false
//    println(exp4)

    /**
     * Estruturas de Seleção
     *
     */
    //IF
//    val temp = 10
//    if (temp > 22)
//        println("Está calor")
//        println("A temperatura é $temp") //este nao esta no block IF, apenas a primeira linha apos o IF. Neste caso usar chaves

//    println("fim do programa")

    //ELSE
//    val temp = 25
//    if (temp > 22){
//        println("Está calor")
//    } else {
//      println("Está frio")
//    }

    /**
     * Exercício
     *
     * Escreva um programa que recebe um valor numérico pelo teclado, multiplica por ele mesmo e imprime o resultado.
     * Entretanto, se o valor fornecido for maior que 10, deve ser ajustado para 10 antes de ser multiplicado
     */


//    println("Digite um valor: ")
//    var valor = Scanner(System.`in`).nextInt() // ou readIn().toInt()
//    if ( valor > 10) {
//        valor = 10
//    }
//    valor*=valor
//    println(valor)


    /**
     * Exercicio
     *
     * Escreva um programa que recebe um valor fornecido pelo teclado e diz se ele é par ou ímpar.
     */

//    print(">")
//    val x = readln().toInt()
//
//    if(x%2==0){
//        println("PAR")
//    } else {
//        println("ÍMPAR")
//    }

    /**
     * ELSE IF
     */
//    val v = 10
//
//    if(v > 0) {
//        println("POSITIVO")
//     } else if (v < 0) {
//         println("NEGATIVO")
//     } else {
//         println("ZERO")
//     }


    /**
     * Exercício
     *
     * Escreva um programa que, com base em uma idade fornecida, classifica a pessoa nos grupos abaixo:
     *
     */

//    println("> ")
//    val age = readln().toInt()
//
//    if (age >= 0 && age <= 12) {
//        println("CRIANÇA")
//    } else if (age >=13 && age <= 17) {
//        println("ADOLESCENTE")
//    } else if (age > 18 && age <=65) {
//        println("ADULTO")
//    } else if (age >= 66 && age <= 120){
//        println("SENIOR")
//    } else {
//        println("Idade inválida")
//    }

    /**
     * IF como uma expressão que retorna valores
     *
     */

//   val n = 10
//
//   val r =  if (n%2 ==0) {
//        "PAR"  //esta expressao sera retornada caso entre no bloco
//    } else {
//       "IMPA"  //esta expressao sera retornada caso entre no bloco, precisa ter ELSE e precisa ser do mesmo tipo de retorno, no caso 2 strings
//    }
//
//    println(r)

    /**
     * WHEN
     */

//    val x = 0
//
//    when(x){
//        10 -> println("é 10")
//        20 -> println("é 20")
//        30 -> println("é 30")
//        else -> println("Desconhecido")
//    }
//
//    when(x){
//        in 0..10 -> println("0 a 10")
//        in 11.. 30 -> println("11 a 30")
//        else -> println("Outro intervalo")
//    }
//
//    when(x) {
//        0, 2, 4, 6 -> println("PAR")
//        else -> println("Desconhecido")
//    }
//
//    when{
//        x > 0 -> println("POSITIVO")
//        x < 0 -> println("NEGATIVO")
//        else -> println("ZERO")
//    }

    /**
     * Usando When como expressão que retorna valores
     *
     * Ele retorna sempre a ultima expressão executada do bloco (sempre ira precisar do else)
      */
//    val resposta = when{
//        x > 0 -> "POSITIVO"
//        x < 0 ->"NEGATIVO"
//        else -> "ZERO"
//    }
//    println(resposta)
//
//    println(
//        when{
//            x > 0 -> "POSITIVO"
//            x < 0 -> "NEGATIVO"
//            else -> "ZERO"
//        }
//    )
//
//    val s= 'A'
//
//    val v = when(s) {
//            'A', 'a' -> 1
//            'B', 'b' -> 2
//            else -> 3
//    }
//    println(v)

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
//    print("> ")
//    val v1 = readln().toDouble()
//
//    print("> ")
//    val op = readln()[0]
//
//    print("> ")
//    val v2 = readln().toDouble()
//
//    val r = when (op){
//        '+' -> v1 + v2
//        '-' -> v1 - v2
//        '*' -> v1 * v2
//        '/' -> v1 / v2
//        else -> 0
//    }
//    println("Resultado: $r")


    /**
     * Estruturas de repetição do while
     */

//    var x = 0
//
//    while(x <= 10) {
//        print("$x, ")
//        x++
//    }
//
//    print("$x, ")
//    x = 0
//    do {  //executa pelo menos 1 vez
//        print("$x ")
//        x++
//    } while (x<=10)
//
//
//    var x1 = 10
//    while (x1 < 5) {
//        print("$x1")
//    }
//
//    do {
//        print("$x1")
//    } while (x < 5)


    /**
     * Exercicio
     * Imprima a tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
     */


//    print("> ")
//    val n= readln().toInt()
//
//    var i =1
//    val m = 15
//    while(i <=m)
//        println("$n x $i = ${ n * i++ }")


    /**
     * Estrutura de repetição For
     */

//    for (i in 0 .. 10){
//        print("$i ")
//    }
//    println()
//    for ( i in 10 downTo 0 step 2) {
//        print("$i ")
//    }
//    println()
//    for (i in 10 until 100 step 3){
//        print("$i")
//    }


    /**
     * Exercicio
     * Imprima a tela a tabuada de um número de 1 a 10. O número deve ser fornecido pelo usuário
     * Usando for
     */

//    print("> ")
//    val n = readln().toInt()
//
//    var m = 10
//
//    for(x in 1..m){
//        println("$n x $x = ${n * x}")
//    }

    /**
     * Pulando para o teste loop
     */

//    for (i in 0..50){
//        if(i % 10 == 0) {
//            continue  //usar apenas em estruturas de repetição
//        }
//        print("$i ")
//    }

    /**
     * Pulando para fora do Loop
     */
//    for(i in 0..50){
//        if(i == 20) {
//            break
//        }
//        print("$i ")
//    }
//    println("FIM")

    /**
     *
     * 50. Usando labels para controlar a execução de loops
     */

//    loop@ for(i in 'A'.. 'E'){
//        for(j in 1..5){
//            print("$i$j ")
//
//            if (j == 3){
//                //break@loop
//                continue@loop
//            }
//        }
//        println()
//    }
//    println("\nFIM")

    /**
     * Exercicio
     *
     * Crie um jogo de adivinhação numérica. O computador deve sortear um número aleatório deontro de um intervalo e você
     * deve tentar descobri-lo. A cada tentativa, o programa diz se o número é maior ou menor do que o número tentado.
     * O joogo acaba quando o número tentado for o número correto.
     */

//    val secret = Random.nextInt(0,101)
//
//    while(true) {
//        print("> ")
//         val n = readln().toInt()
//
//        when {
//            n > secret -> println(" O número sorteado é menor ")
//            n < secret -> println(" O número sorteado é maior ")
//            else -> {
//                println("PARABÉNS? Você acertou o número, que era $n")
//               break
//            }
//        }
//    }

    /**
     * Entendendo o escopo de variáveis definidas em blocos
     */

//    val x = 10
//
//    if(x == 10) {
//        val y = 5
//        println(y)
//    }
//
//    for (i in 0 ..100) {
//        println(i)
//    }
//
//    while (x == 10){
//        val j = x
//        println(j)
//    }
//
//    do {
//        val z = 5
//    } while (z == 10)  // penas no do while consigo utilizar a variavel no bloco while que foi criada no escopo Do
//
//    val y: Int
//
//    if(x == 10) {
//        y = 10
//    } else {
//        y = 0
//    }
//    println(y)

    /**
     *
     * 53. Definindo um tipo como nullable
     */
//
//    var n: Int = 10
//    n = 10
//    n = 30
////    n = null // nao pode
//    var x: Int? = 10 //precisa declarar como um possível inteiro nulo
//    x = null

    /**
     * 54. Safe calls em tipos nullable
     */

//    val s1: String? = "abcde"
//    val s1: String? = null
//    println(s1)
//
//    val s2 = s1?.uppercase()
//    println(s2)
//
//    val s3 = s2?.reversed()
//    println(s3)
//
//    val l = s3?.length
//    println(l)

    /**
     * Smart cast para tipos que não aceitam null
     */
//    val s1: String? = "abcde"
////    val s1: String? = null
//
//    if (s1 != null){
//        println(s1)
//
//        val s2 = s1.uppercase()
//        println(s2)
//
//        val s3 = s2.reversed()
//        println(s3)
//
//        val l = s3.length
//        println(l)
//    }

    /**
     * Usando o elvis operetor
     *
     */
//
//    val value: Int? = 10
//
////    val value2 = if(value != null) value else 0
////    println(value2)
//
//    //Usando elvis ?:
//    val value2 = value ?: 0
//    println(value2)

    /**
     * 57. Assumindo o controle com o not null assertion operator
     * Usar com cautela, dificilmente utilizado
     */

//    val s: String? = "abcde"
//    val i = s!!.reversed()  //vc deve garantir que s NUNCA sera nullo, senao tera nullPointerException
//    println(i)


    /**
     * Exrecicio
     *
     * Escreva um programa que mascara uma senha, substituindo seus caracteres por '*'. Se a senha for nula, a senha
     * '1234'deve ser usada, a qual deve ser mascarada depois.
     */

//    val password :String? =  null
//    val defaultPassword = "1234"
//    val mask1 = "".padEnd(password?.length ?: defaultPassword.length, '*') //posso fazer assim ou:
//
//    val mask = "".padEnd((password ?: defaultPassword).length, '*')
//    println(password)
//    println(mask)

    /**
     * Exercício
     *
     *
     * Escreva um programa que solicita um número a um usuário, multiplica ele por 2 duas vezes e subtrai 10. Se o
     * usuário digitar algo que não possa ser convertido em um número, o úmero 2 deve ser assumido como padrão.
     * O programa deve calcular o valor do número e mostrá-lo na tela em uma única expressão.
     */

//    println(
//        readln()
//            .toIntOrNull()
//            ?: 2 //se o valor digitado nao for int ele assume o 2
//            .times(2)
//            .times(2)
//            .minus(10)
//    )



    sayHello()
    sayHello()
    sayHello()
    println("FIM")
}

/**
 * Criando sua primeira função em Kotlin
 */

fun sayHello(){
    println("Hi! Hello!")
}


/**
 * Visibilidade em funções
 */













//const val msg = "Hi!"
//val x = 10












