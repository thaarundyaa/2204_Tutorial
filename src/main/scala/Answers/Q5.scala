package Answers

object Q5 {

  def main(args: Array[String]): Unit = {
    val easyPace: Int = 4
    val tempo:Int = 3

    val sum:Int= calEasy(easyPace) + calTempo(tempo)
    println("The total wholesale cost for 60 copies = " + sum)
  }

  def calEasy(easyPace: Int):Int = {
    return easyPace*8
  }

  def calTempo(tempo: Int):Int = {
    return tempo*7
  }
}
