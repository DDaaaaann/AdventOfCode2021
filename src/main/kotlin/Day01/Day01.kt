package Day01

import print
import readInput

fun main() {
    fun part1(input: List<String>) = input
        .map { it.toInt() }
        .windowed(2)
        .count() { it.component2() > it.component1() }

    fun part2(input: List<String>) = input
        .map { it.toInt() }
        .windowed(3)
        .map { it.sum() }
        .windowed(2)
        .count() { it.component2() > it.component1() }


    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)

    val input = readInput("Day01")
    part1(input).print("Part 1")
    part2(input).print("Part 2")
}
