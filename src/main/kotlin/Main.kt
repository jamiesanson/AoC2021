import java.io.File

fun main(args: Array<String>) {
    val input = File("input").readLines()

    println("Result: ${Day7Part2(input)}")
}