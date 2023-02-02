package Day02

//import flip
import print
import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var result = ""
        for (i in input[0].indices) {
            var ones = 0;
            var zeroes = 0;
            for (digits in input) {
                when (digits.get(i)) {
                    '1' -> {
                        ones++
                    }

                    '0' -> {
                        zeroes++
                    }
                }
            }

            result += if (ones > zeroes) "1" else "0"
        }

        // 11111 - gamma rate = epsilon rate
        val answer = ("1".repeat(input[0].length).toInt(2) - result.toInt(2)) * result.toInt(2)
        println(answer)
        return answer
    }

    fun part2(input: List<String>): Int {
        return 0
    }


    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03_test")
    check(part1(testInput) == 198)

    val input = readInput("Day03")
    part1(input).print("Part 1")
    part2(input).print("Part 2")

}
