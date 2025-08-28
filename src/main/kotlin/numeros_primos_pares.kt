fun main() {
    val numbers = listOf(1, 2, 4, 7, 13, 9, 23)

    // map applies the isPrime function to each element of the list
    val result = numbers.map { isPrime(it) }
    val resulteven = numbers.map{isEven(it)}

    println("Lista de numeros: $numbers")
    println("¿Son primos?: $result")
    println("¿Son pares?: $resulteven")
}

/*
TODO: Function that checks if a number is prime
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}


/*
TODO: Function that checks if a number is even
 */
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}