package easy_exercises

import java.math.BigDecimal

/* PART ONE
The elves are running low on wrapping paper, and so they need to submit an order for more.
They have a list of the dimensions (length l, width w, and height h) of each present, and
only want to order exactly as much as they need.

Fortunately, every present is a box (a perfect right rectangular prism), which makes calculating
the required wrapping paper for each gift a little easier: find the surface area of the box,
which is 2*l*w + 2*w*h + 2*h*l. The elves also need a little extra paper for each present:
the area of the smallest side.

For example:
    - A present with dimensions 2x3x4 requires 2*6 + 2*12 + 2*8 = 52 square feet of wrapping paper
      plus 6 square feet of slack, for a total of 58 square feet.
    - A present with dimensions 1x1x10 requires 2*1 + 2*10 + 2*10 = 42 square feet of wrapping paper
      plus 1 square foot of slack, for a total of 43 square feet.

* All numbers in the elves' list are in feet. How many total square feet of wrapping paper should they order?

*/


class AdventOfCode2015DayTwo {
     fun howMuchWrappingPaper(dimensions: List<String>): Int {
          var totalSquareFeetWrappingPaper = 0
          dimensions.forEach { it ->
               val present = it.split("x")
                    .map {it.toInt() }
               val l = present[0]
               val w = present[1]
               val h = present[2]
               val surfaceArea = listOf(2*l*w , 2*w*h , 2*h*l)
               totalSquareFeetWrappingPaper += surfaceArea.sum() + surfaceArea.min() /2
          }
          return totalSquareFeetWrappingPaper
     }

     fun ribbonCalculator(dimensions: List<String>): Int {
          var totalFeetRibbon: Int = 0
          dimensions.forEach { it ->
               val present = it.split("x")
                    .map{it.toInt()}
                    .sorted()
               val smallestPerimeter: Int = present[0] *2 + present[1] * 2
               val cubicVolume: Int = present[0] * present[1] * present[2]
               totalFeetRibbon += cubicVolume + smallestPerimeter
          }
          return totalFeetRibbon
     }

     // If I wanted to combine the functions into one:
     fun wrappingMaterialsCalculator(dimensions: List<String>): String {
          var totalSquareFeetWrappingPaper = 0
          var totalFeetRibbon: Int = 0
          dimensions.forEach { it ->
               val present = it.split("x")
                    .map {it.toInt() }
               val l = present[0]
               val w = present[1]
               val h = present[2]
               val surfaceArea = listOf(2*l*w , 2*w*h , 2*h*l)
               totalSquareFeetWrappingPaper += surfaceArea.sum() + surfaceArea.min() /2
               totalFeetRibbon += (present[0] * present[1] * present[2]) + (present.sorted()[0] *2 + present.sorted()[1] * 2)
          }
          return "Total square feet wrapping paper needed: $totalSquareFeetWrappingPaper \nTotal feed ribbon needed: $totalFeetRibbon"
     }
}