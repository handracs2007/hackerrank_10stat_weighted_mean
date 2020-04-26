// https://www.hackerrank.com/challenges/s10-weighted-mean/problem

fun main() {
    // Ignore number of numbers
    readLine()

    // Read numbers
    val numbers = readLine()!!.split(" ").map { it.toDouble() }

    // Read weight
    val weight = readLine()!!.split(" ").map { it.toDouble() }

    val weightedMean = numbers.zip(weight).map { it.first * it.second }.sum() / weight.sum()

    println("%.1f".format(weightedMean))
}