/**
 * Sources: Learn Kotlin in One Video
 *
 */

package Learn

import java.util.Random

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

    println(myArray)

    // access values using indexes starting at 0
    println(myArray[0])
    println(myArray[1])
    println(myArray[2])

    // change the value
    myArray[1] = 3.14
    println(myArray[1])

    // elements in array
    println("Array Length: ${myArray.size}")

    // Is element in the array
    println("Doug in Array: ${myArray.contains("Doug")}")

    // Get first elements in array as an array
    var partArray = myArray.copyOfRange(0,1)

    // Get the first element
    println("First: ${str1.first()}")

    // Get index of value
    println("Doug Index: ${str1.indexOf("Doug")}")
    println("Doug Index: ${str1.indexOf("Random")}")

    // Create an array of squares
    var sqArray = Array(5, {x -> x * x})
    println(sqArray[0])
    println(sqArray[1])
    println(sqArray[2])
    println(sqArray[3])
    println(sqArray[4])

    // There are type specific arrays
    var arr2: Array<Int> = arrayOf(1, 2, 3)
    println(arr2[0])
    println(arr2[1])
    println(arr2[2])



    // ----- Ranges -----
    // Define ranges by providing a starting and ending value

    val oneTo10 = 1..10
    val alpha = "A".."Z"

    println(oneTo10)
    println(alpha)

    // Use "in" to search a Range
    println("R in alpha: ${"R" in alpha}")

    // Create ranges that decrement
    val tenTo1 = 10.downTo(1)
    println(tenTo1)

    // Create array up to a value
    val twoTo20 = 2.rangeTo(20)
    println(twoTo20)

    // Step through an array while adding 3
    val rng3 = oneTo10.step(3)
    println(rng3)

    // Cycle through a range and print
    for(x in rng3) println("rng3: $x")

    // Reverse a range
    for(x in tenTo1.reversed()) println("Reverse: $x")


    // ----- Conditionals -----
    // Conditional Operators: >, <, >=, <=, ==, !=
    // Logical Operators: &&, ||, !

    val age = 8

    if (age < 5) {
        println("Go to Preschool")
    } else if (age == 5) {
        println("Go to Kindergarten")
    } else if ( (age > 5) && (age <= 17) ) {
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to College")
    }

    // When works like switch in other languages
    when (age) {

        // Match a list
        0, 1, 2, 3, 4 -> println("Go to Preschool")

        // Match a specific valu
        5 -> println("Go to Kindergarten")

        // Match a range
        in 6..17 -> {
            val grade = age -5
            println("Go to Grade $grade")
        }

        // Default
        else -> println("Go to College")
    }


    // ----- Looping -----
    // if, when, while
    // You can use loops to cycle through arrays ranges
    // or anything else that implements the iterator function

    for (x in 1..10) {
        println("Loop: $x")
    }

    // Generate a random number from 1 to 50
    val rand = Random()                     //  import java.util.Random
    val magicNum = rand.nextInt(50) + 1
    println(magicNum)

    // "while" loops while a condition is true
    var guess = 0

    while (magicNum != guess) {
        guess += 1
    }

    println("Magic num is $magicNum and you guessed $guess")


}




















