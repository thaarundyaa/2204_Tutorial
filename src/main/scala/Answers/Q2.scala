package Answers

object Q2 {
  def main(args: Array[String]): Unit = {
    val temperature:Int = 35
    println(temperature+ "C into Fahrenheit : " + convert(temperature) +"F")
  }

  def convert(temperature : Int): Double = {
    val fahrenheit:Double = temperature *1.800 + 32.00
    return fahrenheit
  }

}
