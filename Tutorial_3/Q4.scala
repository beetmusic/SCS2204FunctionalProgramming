object Q4 {
	
	def main(args: Array[String]) : Unit  = {
		println(calcCost(60))
	}
	
	def calcCost(num : Double ) : Double = {
		calcDiscount(num)+calcShippingCost(num)
	}
	
	def calcDiscount(num : Double ) : Double = {
		num*24.95*60/100
	}
	
	def calcShippingCost(num : Double ) : Double = {
		if(num<=50){
			num*3
		}else{
			num*3+(num-50)*0.75
		}
	}
	
	
}
