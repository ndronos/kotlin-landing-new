/**
 * Iterate: Rubaye Lesson 2.10
 * readLine() .toInt() .toDouble()
 * !!
 */

fun main(args: Array<String>) {

    print("Enter your name: ")
    var name= readLine()
    print("Enter your age: ")
    var age:Int= readLine()!!.toInt()
    print("Enter your department: ")
    var dep:String?
    dep= readLine()
    print("Enter New Pi: ")
    var pi:Double= readLine()!!.toDouble()

    println()
    println("The output is...")
    println("Name: "+ name)
    println("Age: "+ age)
    println("Department: "+ dep)
    println("New Pi: "+ pi)

}