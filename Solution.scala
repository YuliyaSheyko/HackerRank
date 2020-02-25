object Solution {
  def main(args: Array[String]) {
    val line = scala.io.StdIn.readLine().split(" ")
    val n = line(0).toCharArray.map(_.asDigit).sum
    val k = line(1).toLong
    val input = (n * k).toString
    println(superDigit(input))
  }
  @scala.annotation.tailrec
  final def superDigit(input: String): Int = input.length match {
    case 1 => input.toInt
    case _ => superDigit(input.toCharArray.map(_.asDigit).sum.toString)
  }
}
