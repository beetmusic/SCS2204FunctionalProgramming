object Q1 {
  
  def main(args: Array[String]) {
  
	println("Enter the Amount: ")
	
	val amount = scala.io.StdIn.readInt()
  
    println(interest(amount))
  
  }
  
  def interest(amount:Double):Double = {
  
  	if(amount<20000){
		amount*2/100		
	}else if(amount<200000){
		amount*4/100
	}else if(amount<2000000){
		amount*3.5/100
	}
	else{
		amount*6.5/100
	}
	
  }
  
}
