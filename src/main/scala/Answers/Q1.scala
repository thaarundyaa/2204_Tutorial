package Answers

object Q1 {

  def main(args: Array[String]): Unit = {
    val r:Int = 5
    println("Area of disk : " + calArea(r))
  }

  def calArea(r: Int): Double = {
    val pi:Double = 3.14
    val Area:Double = pi*r*r
    return Area
  }

}
