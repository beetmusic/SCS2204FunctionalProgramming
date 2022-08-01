object Q2 {
  
  def main(args: Array[String]) {
  
	println("Enter the Number: ")
	
	val number = scala.io.StdIn.readInt()
  
  	fun(number)
  
  }
   
  def fun(number : Double ){
	  if(number<=0){
	  	println("Negative/zero")
	  }else if(number%2==0){
		println("Even")
	  }else{
	    println("Odd")
	  }
  }
  
}
