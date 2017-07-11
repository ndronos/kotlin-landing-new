/**
 * Iterate: ?v=viiDaLpPfN4
 * data class
 */

class Customer(val name: String, val email: String)    // Customer@abcd1234


fun main(args: Array<String>) {
    val customer = Customer("John Smith", "john.smith@somewhere.com")
    println(customer)
}