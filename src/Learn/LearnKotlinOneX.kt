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


//  Type Inference
//  In most cases, Kotlin can determine what type the variable is,
//  so we don't have to explictly specify it every time.

    val foo: Int = 7                //  Explicitly declared

    println(foo)


// Datatypes: String                // represented in similar way as in Java
// Scaping done with backslash "\"

    val fooString = "My String is Here!"
    println(fooString)

    val barString = "New line?\nNo problem!"
    println(barString)

    val bazString = "Add a tab\tNo problem!"
    println(bazString)


// Raw String                       // delimited by triple quote """
                                    // can contain newlines and any other characters
    val fooRawString = """
text \t [] () {} \n
code \t zzz ...
"""
    println(fooRawString)


// Strings: Template Expressions    // starts with dollar sign $

    val fooTemplateString = "$fooString has ${fooString.length} characters"
    println(fooTemplateString)

// Nullable     // for a variable to hold null it must be explicitly specified as nullable

    var fooNullable: String? = "abc"    // nullable by appending a ? to its type
    println(fooNullable?.length)        // access by using the ? operator
    fooNullable = null
    println(fooNullable?.length ?: -1)  // ?: operator specify alternative value to use


// Functions    // declared using "fun" keyword
                // arguments specified in brackets after function name
                // arguments optionally can have a default value
                // The function return type, if required, is specified after the arguments

    fun hello(name: String = "world"): String {
        return "Hello, $name!"
    }

    println(hello())

    println(hello("foo"))
    println(hello(name = "bar"))

}


