/**
 * Iterate: ?v=viiDaLpPfN4
 * .filter arrayListOf()
 */

fun main(args: Array<String>) {
    val numbers = arrayListOf<Int>(1, 2, 3, 4, 5, 6)

    println("Even numbers are ${numbers.filter { it % 2 == 0} }")
}