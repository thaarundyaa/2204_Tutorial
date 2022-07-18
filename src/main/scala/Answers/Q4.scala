package Answers

object Q4 {

  def main(args: Array[String]): Unit = {
    val price:Double = 24.95
    val copies:Int = 60

    val cost:Double = getDiscount(price)*60 + shippingCost(copies)

    println("The total wholesale cost for 60 copies = " + cost)
  }

  def getDiscount(price:Double): Double = {
    return price*60/100
  }

  def shippingCost(copies:Int):Double = {
    return 3+ (copies - 50)*0.75
  }

}
