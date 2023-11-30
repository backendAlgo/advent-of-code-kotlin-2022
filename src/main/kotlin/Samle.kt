package day01

import println
import readInput

fun main() {
  val profile = "basic"
  val dayId = "00"
  fun part1(input: List<String>): Int {
    return input.size
  }

  fun part2(input: List<String>): Int {
    return input.size
  }

  val input = readInput("day$dayId/Day${dayId}_$profile")
  check(part1(input) == 1)

  part1(input).println()
//  part2(input).println()
}
