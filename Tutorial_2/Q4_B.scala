package Tutorial_03

object Q4_B {
  def main(args: Array[String]) = {
    print(profit(10), profit(15), profit(20), profit(25), profit(30), profit(35))
  }

  def calculateAttendeeCost(n: Int) = n * 3

  def calculateAttendence(ticketPrice: Int): Int = 120 + (15 - ticketPrice) * 4

  def totalSales(ticketPrice: Int): Double = {
    calculateAttendence(ticketPrice) * ticketPrice
  }

  def totalCost(ticketPrice: Int): Double = {
    calculateAttendeeCost(calculateAttendence(ticketPrice)) + 500
  }

  def profit(ticketPrice: Int): Double = {
    totalSales(ticketPrice) - totalCost(ticketPrice)
  }
}
