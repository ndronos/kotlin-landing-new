/**
 * Iterate: Rubaye Lesson 2.12
 * Null Safety !! ? null
 */

fun main(args: Array<String>) {

    var name:String     // a non-null type String
    name = "JetBrains"
    println(name)
//  name = null         // null can not be a value of a non-null type String
//  println(name)

    var firstname:String?   // accepts null
    firstname = "IntelliJ"
    println(firstname)
    firstname = null        // null
    println(firstname)

    var lastname:String?    //
    lastname = "IDEA"
    println(lastname)
    lastname = null
    println(lastname)       // null
                            //
//  println(lastname!!)     // !! means has to have value, if doesn't throw an exception (an error, stop the program)
                            // Exception in thread ... kotlin.KotlinNullPointerException at ...

    var test:String?
    test = null
    println(test)
    test = "null"
    println(test)
    test = ""           // (empty is not a null?)
    println(test)

}