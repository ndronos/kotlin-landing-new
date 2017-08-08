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

    val bigInt: Int = Int.MAX_VALUE
    val smallInt: Int = Int.MIN_VALUE

    println("Biggest Int: " + bigInt)
    println("Smallest Int: " + smallInt)

    val bigLong: Long = Long.MAX_VALUE
    val smallLong: Long = Long.MIN_VALUE

    println("Biggest Long: " + bigLong)
    println("Smallest Long: " + smallLong)

    val bigDouble: Double = Double.MAX_VALUE
    val smallDouble: Double = Double.MIN_VALUE

    println("Biggest Double: " + bigDouble)
    println("Smallest Double: " + smallDouble)

    val bigFloat: Float = Float.MAX_VALUE
    val smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float: " + bigFloat)
    println("Smallest Float: " + smallFloat)

    // Doubles are normally precise to 15 digits
    val dblNum1: Double = 1.11111111111111111111
    val dblNum2: Double = 1.11111111111111111111

    println("Double Sum: " + (dblNum1 + dblNum2))

    /* We also have the following
    Short   16 bytes
    Byte     8 bytes
    */

    // Booleans are either true or false

    if (true is Boolean) println("true is Boolean")

    // Char: characters are single quoted characters

    val letterGrade: Char = 'A'

    println("A is a Char: " + (letterGrade is Char))


    // ----- Casting -----
    // You can cast from one type to another using
    // toInt, toShort, toLong, toFloat, toDouble,
    // toChar, toString

    println("3.14 to Int: " + (3.14.toInt()))
    println("A to Int: " + (letterGrade.toInt()))
    println("65 to Char: " + (65.toChar()))


    // ----- Strings -----
    // Strings are double quoted series of characters

    val myName = "Kotlin"

    val longStr = """This is a
    long string"""

    println(myName)
    println(longStr)

    var fName = "JetBrains"
    var lName = "IDEA"

    // you can change values
    fName = "IntelliJ"

    println(fName)

    // you can combine strings
    var fullName = fName + " " + lName

    println(fullName)

    // you can use string interpolation
    println("Name: $fullName")

    // you can perform other operations with {}
    println("1 + 2 = ${1 + 2}")

    // get length
    println("String length of '$longStr'0 is ${longStr.length}")

    var str1 = "A Random String"
    var str2 = "a random string"

    // Compare strings
    println("Strings Equal: ${str1.equals(str2)}")

    // Compare strings
    // 0: Equal, Negative if less, Positive if greater
    println("Compare A to B: ${"A".compareTo("B")}")

    // Get character at an index
    println("2nd Index: ${str1.get(2)}")

    // Get a substring from start up to but not including end
    println("Index 2-7: ${str1.subSequence(2,8)}")

    // Checks if a string contains another
    println("Contains random: ${str1.contains("random")}")
    println("Contains random: ${str1.contains("Random")}")


    // ----- Arrays -----
    // can store multiple types in arrays
    var myArray = arrayOf(1, 1.23, "Doug")




}




















