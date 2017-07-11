/**
 * Iterate: /index
 * class
 */

class Greeter(val name: String) {

    fun greet() {
        println("Hello, $name")
    }

}

fun main(args: Array<String>) {

    Greeter(args[0]).greet()

}

/* (CLI) No arguments?
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at HelloObjectOrientedKt.main(helloObjectOriented.kt:16)
 */