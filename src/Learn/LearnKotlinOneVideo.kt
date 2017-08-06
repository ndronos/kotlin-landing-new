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
    println("Smallest Int: " + smallInt)

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long: " + bigLong)
    println("Smallest Long: " + smallLong)

    var bigDouble: Double = Double.MAX_VALUE
    var smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double: " + bigDouble)
    println("Smallest Double: " + smallDouble)

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float: " + bigFloat)
    println("Smallest Float: " + smallFloat)

    // Doubles are normally precise to 15 digits
    var dblNum1: Double = 1.11111111111111111111
    var dblNum2: Double = 1.11111111111111111111

    println("Double Sum: " + (dblNum1 + dblNum2))

    /* We also have the following
    Short   16 bytes
    Byte     8 bytes
    */

    // Booleans are either true or false

    if (true is Boolean) println("true is Boolean")

    // Char: characters are single quoted characters

    var letterGrade: Char = 'A'

    println("A is a Char: " + (letterGrade is Char))


    // ----- Casting -----
    // You can cast from one type to another using
    // toInt, toShort, toLong, toFloat, toDouble,
    // toChar, toString

    println("3.14 to Int: " + (3.14.toInt()))
    println("A to Int: " + (letterGrade.toInt()))
    println("65 to Char: " + (65.toChar()))

}




















