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

    for (x in 1..20) {

        if (x % 2 == 0) {
            // "continue" jumps back to the top of the loop
            continue
        }

        println("Odd: $x")

        //"break" jumps out of the loop and stops looping
        if (x == 15) break

    }


    //
    var arr3: Array<Int> = arrayOf(3, 6, 9)

    // Iterate for indexes
    for (i in arr3.indices) {
        println("Mult 3: ${arr3[i]}")
    }

    // Output indexes
    for ( (index, value) in arr3.withIndex() ) {
        println("Index: $index & Value: $value")
    }


    // ----- Functions -----
    // Functions start with "fun", function name,
    // parameters and return type

    fun add(num1: Int, num2: Int) : Int = num1 + num2
    println("5 + 4 = ${add(5,4)}")

    // Don't need a return type with single line functions
    // Can define default values for parameters
    fun subtract(num1: Int = 1, num2: Int = 1) = num1 - num2
    println("5 - 4 = ${subtract(5,4)}")

    // You can use named parameters
    println("5 - 4 = ${subtract(num1 = 5, num2 = 4)} ")

    // Use "Unit" if you return nothing
    fun sayHello(name: String) : Unit = println("Hello $name")
    sayHello("Kotlin")

    // Function can return 2 values with Pair and 3 with Triple
    val (two, three) = nextTwo(1) // Unresolved reference
    println("1 $two $three")

    // Send a variable number of parameters
    println("Sum: ${getSum(1,2,3,4,5)}") // Unresolved reference

    // We can define function literals
    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println("5 * 3 = ${multiply(5,3)}")

    // Calculate the Factorial with Tail Recursion
    // Factorial 5 * 4 * 3 * 2 * 1
    println("5! = ${fact(5)}")  // Unresolved reference


    // ----- Higher Order Functions -----
    // High Order functions either accepts or
    // returns another functions

    // Use filter to find evens
    val numList = 1..20

    // If a function has only one parameter you don't
    // have to declare, but just use it instead
    val evenList = numList.filter { it % 2 == 0 }
    evenList.forEach { n -> println(n) }

    // Call a function that returns dynamically
    // created functions
    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    // A function that receives a list and a function
    val multiply2 = { num1: Int -> num1 * 2 }
    val numList2 = arrayOf(1,2,3,4,5)
    mathOnList(numList2, multiply2)


    // ----- Collection Operators -----

    // Use "reduce" to sum values in a list
    val listSum = numList2.reduce { x, y ->  x + y }
    println("Reduce Sum: $listSum")

    // "fold" is like "reduce", but it starts with
    // an initial value
    val listSum2 = numList2.fold(5) { x, y -> x + y }
    println("Fold Sum: $listSum2")

    // check if any values are even
    println("Evens: ${numList2.any { it % 2 == 0 } }")

    // check if all values are even
    println("Evens: ${numList2.all { it % 2 == 0 } }")

    // return a list of values greater than 3
    val big3 = numList2.filter { it > 3 }
    big3.forEach { n -> println(">3: $n") }

    // use "map" to perform an action on every item
    // and return a new list
    val times7 = numList2.map { it * 7 }
    times7.forEach { n -> println("*7: $n") }


    // ----- Exception Handling -----
    // Exceptions are handled just like with Java

    val divisor = 2

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't divide by Zero")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println("${e.message}")
    }


    // ----- Lists -----
    // There are immutable Lists and mutable MutableLists

    // Create a immutable list
    val list2: List<Int> = listOf(1,2,3)
    println(list2)

    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5)
    println(list1)

    // Add an item
    list1.add(6)
    println(list1)

    // Get first item
    println("1st: ${list1.first()}")

    // Get last
    println("Last: ${list1.last()}")

    // Get value at index
    println("[0] 1st: ${list1[0]}")
    println("[1] 2nd: ${list1[1]}")
    println("[2] 3rd: ${list1[2]}")

    println("[0] 1st: ${list2[0]}")
    println("[1] 2nd: ${list2[1]}")
    println("[2] 3rd: ${list2[2]}")

    // Get a list starting from index to another
    var list3 = list1.subList(0, 3)
    println(list3)

    // Size of List
    println(list1)
    println("Length: ${list1.size}")

    // Clear a Mutable list
    println(list3)
//  list3.clear()               // affects list1
    println("list3: $list3")
    println("list1: $list1")

    // Remove a value
    println(list1)
    list1.remove(1)
    println(list1)

    // Remove a value
    list1.removeAt(0)
    println(list1)

    // Add value at index
    list1[3] = 10
    println(list1)

    //
    list1.forEach { n -> println("Mutable List: $n") }


    // ----- Maps -----
    // modifiable collection that holds key value pairs

    // Create a Map
    val map = mutableMapOf<Int, Any?>()
    println(map)

    // Create a Map and add values
    val map2 = mutableMapOf(1 to "Doug", 2 to 25)
    println(map2)

    // Add values
    map[1] = "IntelliJ"
    map[2] = "IDEA"
    println(map)

    // Get size
    println("Map Size: ${map.size}")

    // Add a key value
    map.put(3, "Kotlin")
    println(map)











    // ----- Null Safety ----
    // Null safety is built into Kotlin

    // By default you cannot assign null
    // var nullVal: String = null
    // Null can not be a value of a non-null type String

    // To allow for a null value use ?
    var nullVal: String? = null
    println(nullVal)

    // A function that may return null uses ?
    // fun myFun(): String?

    // Kotlin provides for the oportunity of a
    // null value if an if statement protects from danger
    fun returnNull(): String? {
        return null
    }

    var nullVal2 = returnNull()

    // This is a smart cast
    if(nullVal2 != null) {
        println(nullVal2.length)
    }

    // We could use the force operator !! to
    // force a null assignment
//  var nullVal3 = nullVal2!!.length // Exception in thread...

    // The Elvis operator assigns a default value if null
    var nullVal4: String = returnNull() ?: "No Name"
    println(nullVal4)


}






// ----- Functions -----

// Return 2 values
fun nextTwo(num: Int): Pair<Int, Int> {
    return Pair(num + 1, num + 2)
}

// Receive variable number of parameters
fun getSum(vararg nums: Int): Int {
    var sum = 0

    // for each value in the array add it to sum
    nums.forEach { n -> sum += n }

    return sum
}

// Factorial
fun fact(x: Int): Int {
    tailrec fun factTail(y: Int, z: Int): Int {
        if (y == 0) return z
        else return factTail(y -1, y * z)
    }
    return factTail(x, 1)
}


// ----- Higher Order Functions -----

// Returns a custom function that multiplies values
// times the value passed to it
fun makeMathFunc(num1: Int): (Int) -> Int = { num2 -> num1 * num2 }


// Receives a list and a function to use on the list
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int ) {
    for (num in numList) {
        println("MathOnList: ${myFunc(num)}")
    }
}









