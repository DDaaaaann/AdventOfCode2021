package Day02

import print
import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var depth = 0;
        var horizontal = 0;

        for ((direction, amount) in input.map { it.split(" ") }) {
            when (direction) {
                "forward" -> {
                    horizontal += amount.toInt()
                }

                "up" -> {
                    depth -= amount.toInt()
                }

                "down" -> {
                    depth += amount.toInt()
                }
            }
        }
        return horizontal * depth
    }

    fun part2(input: List<String>): Int {
        var depth = 0;
        var horizontal = 0;
        var aim = 0;

        for ((direction, amount) in input.map { it.split(" ") }) {
            when (direction) {
                "forward" -> {
                    depth += aim*amount.toInt()
                    horizontal += amount.toInt()
                }

                "up" -> {
                    aim -= amount.toInt()
                }

                "down" -> {
                    aim += amount.toInt()
                }
            }
        }
        return horizontal * depth
    }


    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    part1(input).print("Part 1")
    part2(input).print("Part 2")

}
