object Q5 {

	def main(args: Array[String]) : Unit  = {
		println(calcTime(2,8,3,7))	
	}
	
	def calcTime(d1:Double,v1:Double,d2:Double,v2:Double) : Double = {
		d1*v1+d2*v2
	}
}
