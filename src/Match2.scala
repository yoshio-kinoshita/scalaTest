object Match2 {
  def main(args: Array[String]) {
    val x: Any = "hello"

    val res = x match {
      case i: Int =>
        println("x = " + i); 1
      case s: String =>
        println("x = " + s); 2
      case _ => println("other"); 3
    }
    
    println(res);
  }

}