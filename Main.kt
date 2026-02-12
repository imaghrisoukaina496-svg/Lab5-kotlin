fun main() {

    println("Lab récursion – Factorielle")
    println()

    // Version itérative
    println("=== Version itérative ===")
    println("factorialIterative(1) = ${factorialIterative(1)}")
    println("factorialIterative(4) = ${factorialIterative(4)}")
    println("factorialIterative(5) = ${factorialIterative(5)}")
    println()

    // Version récursive
    println("=== Version récursive ===")
    println("factorialRecursive(4) = ${factorialRecursive(4)}")
    println("factorialRecursive(5) = ${factorialRecursive(5)}")
    println()

    // Trace récursive
    println("=== Trace récursive ===")
    val resultTrace = factorialTrace(4)
    println("Résultat final = $resultTrace")
    println()

    // Version sécurisée
    println("=== Version sécurisée ===")
    println("factorialSafe(5) = ${factorialSafe(5)}")
    println("factorialSafe(-3) = ${factorialSafe(-3)}")
    println()

    // Somme récursive
    println("=== Somme de 1 à n ===")
    println("sumTo(5) = ${sumTo(5)}")
    println()

    // Puissance récursive
    println("=== Puissance récursive ===")
    println("power(2, 3) = ${power(2, 3)}")
}

// Version itérative
fun factorialIterative(number: Int): Int {
    var accumulator = 1

    for (i in 1..number) {
        accumulator *= i
    }

    return accumulator
}

// Version récursive
fun factorialRecursive(number: Int): Int {
    if (number <= 1) {
        return 1
    }

    return factorialRecursive(number - 1) * number
}

// Version avec trace
fun factorialTrace(number: Int): Int {
    println("Appel de factorialTrace($number)")

    if (number <= 1) {
        println("Base case atteint pour $number, retour 1")
        return 1
    }

    val result = factorialTrace(number - 1) * number
    println("Retour de factorialTrace($number) = $result")
    return result
}

// Version sécurisée (gestion des négatifs)
fun factorialSafe(number: Int): Int {
    if (number < 0) {
        println("Factorielle non définie pour les nombres négatifs: $number")
        return 0
    }

    if (number <= 1) {
        return 1
    }

    return factorialSafe(number - 1) * number
}

// Somme récursive de 1 à n
fun sumTo(n: Int): Int {
    if (n <= 1) {
        return n
    }

    return sumTo(n - 1) + n
}

// Puissance récursive
fun power(base: Int, exponent: Int): Int {
    if (exponent == 0) {
        return 1
    }

    return base * power(base, exponent - 1)
}
