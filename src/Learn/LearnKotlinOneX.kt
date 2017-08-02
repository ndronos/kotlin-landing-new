/**
 * Sources: Learn Kotlin in X Minutes, Learn Kotlin in One Video
 *
 * Multi-line comment
 */
// Single-line comment

// "Package" keyword works same way as Java
//  Package directive doesn't match file location // Move file to ... >
package Learn

//  Entry point to a Kotlin program is a function named "main"
//  The function is passed a "Array" containing any command-line arguments "args"
fun main(args: Array<String>) {
    println("Hello, World!")        // "Hello" classic


    val fooVal = 1                  // cannot reassign to something else

    var fooVar = 10                 // can be reassined
    fooVar = 20

    println(fooVal)
    println(fooVar)

}


