object Q3 {
  
  def main(args: Array[String]) {
  
	println(formatNames("Benny")()(toUpper))
	println(formatNames("Niroshan")(0,1)(toUpper))
	println(formatNames("Saman")()(toLower))
	println(formatNames("Kumara")(5)(toUpper))
  
  }
  
  def toUpper(text : String ) : String = {
	 text.toUpperCase()
  }
  
  def toLower(text : String) : String = {
  	text.toLowerCase
  }
  
  def formatNames(name : String)(list : Int*)(fun : String => String) : String ={
  		if(list.isEmpty){
			return fun(name)
		}
		
		var nam = ""
		
		var i =0;
		
		while(i < name.length()){
			if(list.contains(i)){
				nam=nam+fun(name.charAt(i).toString)
			}
			else{
				nam=nam+name.charAt(i).toString
			}
			
			i+=1
		}
		
		nam
  }
  
  
  
}
