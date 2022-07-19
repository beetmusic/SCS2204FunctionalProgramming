package Tutorial_03

object Q4_A {
  def main(args: Array[String]): Unit = {
    println("The take home salary for 40 Normal hours and 30 OT hours is " +
      calculateTakeHomeSalary(calculateTotalWage(30, 40), calculateTax(calculateTotalWage(30, 40)))
      + ".")
  }

  def calculateTotalWage(x: Int, y: Int): Double = calculateOTHourWage(x) + calculateNormalHourWage(y)

  def calculateNormalHourWage(n: Int): Double = n * 250.0

  def calculateOTHourWage(n: Int): Double = n * 85.0

  def calculateTax(wage: Double): Double = wage * 12.0 / 100

  def calculateTakeHomeSalary(wage: Double, tax: Double): Double = wage - tax
}
