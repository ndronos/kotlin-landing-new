/**
 * Iterate: /index
 * class
 */

class Greeter(val name: String) {           //  Class with a primary constructor and a member function

    fun greet() {
        println("Hello, $name")             //  String Interpolation to cut down ceremony.
    }

}

fun main(args: Array<String>) {

//  Greeter(args[0]).greet()                //  Note that there's no 'new' keyword used to create an object
    Greeter("Kotlina!").greet()
}

/* (CLI) No arguments? (args[0])
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at HelloObjectOrientedKt.main(helloObjectOriented.kt:16)
 */