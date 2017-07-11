/**
 * Iterate: ?v=viiDaLpPfN4
 * .filter arrayListOf()
 */

fun main(args: Array<String>) {
    val numbers = arrayListOf<Int>(1, 2, 3, 4, 5, 6)

    println("Even numbers are ${ numbers.filter { it % 2 == 0 } } ")
    // Improvement...
    println("Odd  numbers are ${ numbers.filter { it % 2 == 1 } } ")

    // Improve interpolation...
    val even = numbers.filter { it % 2 == 0 }
    val odd  = numbers.filter { it % 2 == 1 }

    println("Even numbers are ${even} ")
    println("Odd  numbers are ${odd}  ")

    println("Even numbers are $even ")
    println("Odd  numbers are $odd  ")
}