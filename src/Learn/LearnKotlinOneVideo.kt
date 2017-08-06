/**
 * Sources: Learn Kotlin in One Video
 *
 */

package Learn

fun main(args: Array<String>) {
    println("Hello, world!")


    // ----- Data Types -----

    // Variables

    val name = "Kotlin"         // Create a read only variable
    val creation = 2011
    var now = 2017              // Mutable (changeable) variable
    println(now - creation)

    // Kotlin uses Type Inference, but you can define the type

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int " + smallInt)




}

