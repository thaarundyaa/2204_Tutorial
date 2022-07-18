package Answers

object Q3 {

  def main(args: Array[String]): Unit = {
    val r:Int = 5
    println("Volume of a sphere = " + calVolume(r))
  }

  def calVolume(r: Int): Double = {
    val pi:Double = 3.14
    val Volume:Double = 4/3*pi*r*r*r
    return Volume
  }

}
