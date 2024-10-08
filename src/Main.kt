fun main() {
    println("Escreva o primeiro número")
    val num1 = readln().toInt()

    println("Escreva o segundo número")
    val num2 = readln().toInt()

    println("Escreva o terceiro número")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3) {
        println("O maior número é o $num1")
    } else {
        if (num2 > num1 && num2 > num3) {
            println("O maior número é o $num2")
        } else {
            println("O maior número é o $num3")
        }
    }
}