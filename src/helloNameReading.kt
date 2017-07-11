/**
 * Iterate: /index
 *
 */

fun main(args: Array<String>) {
//  if (args.size() == 0) {
    if (args.size   == 0) {
        println("Provide a name")
        return

    }
    println("Hello, ${args[0]}!")

}

/*
Error:(8, 14) Kotlin: Expression 'size' of type 'Int' cannot be invoked as a function. The function 'invoke()' is not found

    if (args.size() == 0) {
             ^
 */