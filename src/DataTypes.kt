/**
 * Iterate: Rubaye Lesson 2.8 2.9
 * val var String Int
 * ? Null + Concatenation
 */

fun main(args: Array<String>) {

    val named = "JetBrains"
    println(named)

    val name:String = "Kotlin"
    println(name)

    val year:Int = 2017
    println(year)

    val tool:String
    tool = "IntelliJ IDEA"
    println(tool)

    val canary:String?
    canary = "Android Studio"
    var version:Int?
    version = 3
    println(canary + " " + version)
    version = 4
    println(canary + " " + version)

}