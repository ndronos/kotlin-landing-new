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


// Functions    // "vararg" keyword allow variable number of arguments passed

    fun varargExample(vararg names: Int) {
        println("Argument has ${names.size} elements")
    }

    varargExample()
    varargExample(1)
    varargExample(1, 2, 3)


// Functions    // single expression curly brackets can be omitted
                // the body is specified after a = symbol

    fun odd(x: Int): Boolean = x % 2 == 1
    println(odd(6))
    println(odd(7))

    fun even(x: Int) = x % 2 == 0           // type inferred
    println(even(6))
    println(even(7))


// Functions can take functions as arguments and return functions

    fun not(f: (Int) -> Boolean): (Int) -> Boolean {
        return {n -> !f.invoke(n)}
    }

// Named functions can be specified as arguments using the :: operator

    val notOdd = not(::odd)
    println(notOdd(6))
    println(notOdd(7))

    val notEven = not(::even)
    println(notEven(6))
    println(notEven(7))

// Lambda Expressions can be specified as arguments

    val notZero = not {n -> n == 0}
    println(notZero(1))
    println(notZero(0))

// Lambda Expression: if has only one parameter then its declaration can be ommited (along with the ->)

    val notPositive = not {it > 0}
    println(notPositive(1))
    println(notPositive(-1))


    for (i in 0..4) {
        print("${i}: ")
        print("${notOdd(i)} ")
        print("${notEven(i)} ")
        print("${notZero(i)} ")
        print("${notPositive(i)} ")
        print("\n")
    }


// Classes      // "class" keyword is used to declare classes

    class ExampleClass(val x: Int) {

        fun memberFunction(y: Int): Int {
            return x + y
        }

        infix fun infixMemberFunction(y: Int): Int {
            return x * y
        }
    }

// Classes      // Constructor: create new instance
                // Kotlin does not have a "new" keyword

    val fooExampleClass = ExampleClass(7)

// Classes      // Member functions called using dot notation

    println(fooExampleClass.memberFunction(4))      // x:7 + y:4

// Classes      // Infix function: marked with "infix" keyword
                // can be called using infix notation

    println(fooExampleClass infixMemberFunction 4)      // x:7 * y:4

// Data Classes // Concise way to create classes that hold just data
                // Automatically generated methods:
                // hashCode, equals, toString

    data class DataClassExample (val x: Int, val y: Int, val z: Int)
    val fooData = DataClassExample(1, 2, 4)
    println(fooData)

// Data Classes // have a "copy" function
    val fooCopy = fooData.copy(y = 100)
    println(fooCopy)

// Objects can be destructured into multipe variables
    val (a, b, c) = fooCopy
    println("$a $b $c")

// destructuring in "for" loop
    for ((a, b, c) in listOf(fooData)) {
        println("$a $b $c")
    }

// Map.entry is destructable as well
    val mapData = mapOf("a" to 1, "b" to 2)
    for ((key, value) in mapData) {
        println("$key -> $value")
    }

}


