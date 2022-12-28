fun main() {
    // Cria um array de inteiros com os valores 1, 2 e 3
    val numbers = intArrayOf(1, 2, 3)

    // Acessa o primeiro elemento do array
    val first = numbers[0]
    println(first)  // imprime "1"

    // Altera o valor do segundo elemento do array
    numbers[1] = 4
    println(numbers[1])  // imprime "4"

    // Itera sobre os elementos do array
    for (number in numbers) {
        println(number)
    }
}


